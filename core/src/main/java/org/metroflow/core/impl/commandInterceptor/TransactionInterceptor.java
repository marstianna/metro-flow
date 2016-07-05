package org.metroflow.core.impl.commandInterceptor;

import org.metroflow.core.BaseCommand;
import org.metroflow.core.bean.Execution;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 事务控制拦截器
 *
 * Created by zoupeng on 16/1/13.
 */
public class TransactionInterceptor extends AbstractCommandInterceptor{

    private PlatformTransactionManager transactionManager;

    public TransactionInterceptor(PlatformTransactionManager _transactionManager){
        this.transactionManager = _transactionManager;
    }

    @Override
    public <T> T execute(final Execution execution, final BaseCommand<T> command) {

        final TransactionTemplate transactionTemplate = new TransactionTemplate(transactionManager);
        transactionTemplate.setPropagationBehavior(command.getPropagationBehavior());
        T result = transactionTemplate.execute(new TransactionCallback<T>() {
            @Override
            public T doInTransaction(TransactionStatus transactionStatus) {
                return next.execute(execution,command);
            }
        });
        return result;
    }

}
