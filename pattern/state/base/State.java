package pattern.state.base;

import pattern.state.Context;

/**
 * 是否把上下文对象作为参数传递，关系到是否将状态的转换封装在实现的状态子类
 * 还是上下文对象中。
 * @author dell990-026
 *
 */
public interface State {
	void execute(Context content);
}
