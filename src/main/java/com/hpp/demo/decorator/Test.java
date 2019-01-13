package com.hpp.demo.decorator;/**
 * @Author:pengpeng.han
 * @Description:
 * @Date: 21:19 2019/1/13
 * @Modified By:
 */

/**
 *
 * @author pengpeng.han
 * @create 2019-01-13 21:19
 **/
public class Test {

	public static void main(String[] args) {
		Component component = new ConcreteDecorator(new ConcretComponent());
		component.biu();
	}
}
