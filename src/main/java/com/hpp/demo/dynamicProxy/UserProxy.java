package com.hpp.demo.dynamicProxy;/**
 * @Author:pengpeng.han
 * @Description:
 * @Date: 19:02 2019/1/13
 * @Modified By:
 */

import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 * @author pengpeng.han
 * @create 2019-01-13 19:02
 **/
public class UserProxy implements InvocationHandler{

	private IUser target;

	public UserProxy(IUser target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("我是代理start:"+ method.getName());
		Object invoke = method.invoke(target, args);
		System.out.println("我是代理end");
		return invoke;
	}
	
	
	
}
