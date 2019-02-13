package com.alibaba.cola.command;

import com.alibaba.cola.dto.Command;
import com.alibaba.cola.dto.Response;

/**
 *  任务执行器 通过类描述我们知道 这是一个支持泛型的类
 *   每一个具体的实现类 都一一对应这一个Command 和 Response子类
 *   eg. PlaceOrderCommandExecutor 对应了 PlaceOrderCommand 和 PlaceOrderResultResponse
 * CommandExecutorI
 * 
 * @author fulan.zjf 2017年10月21日 下午11:01:05
 */
public interface CommandExecutorI<R extends Response, C extends Command> {

    public R execute(C cmd);
}
