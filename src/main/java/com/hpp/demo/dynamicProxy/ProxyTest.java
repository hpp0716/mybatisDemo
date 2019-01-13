package com.hpp.demo.dynamicProxy;/**
 * @Author:pengpeng.han
 * @Description:
 * @Date: 19:06 2019/1/13
 * @Modified By:
 */

import com.sun.org.apache.bcel.internal.generic.IUSHR;

import java.lang.reflect.Proxy;

/**
 *
 * @author pengpeng.han
 * @create 2019-01-13 19:06
 **/
public class ProxyTest {

	public static void main(String[] args) {

		User user = new User();
		IUser userProxy = (IUser)Proxy.newProxyInstance(User.class.getClassLoader(), new Class[]{IUser.class}, new UserProxy(user));
		userProxy.eat("apple");


	}
	
	
}
