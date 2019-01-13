package com.hpp.demo.dynamicProxy;/**
 * @Author:pengpeng.han
 * @Description:
 * @Date: 19:00 2019/1/13
 * @Modified By:
 */

import javax.sound.midi.Soundbank;

/**
 *
 * @author pengpeng.han
 * @create 2019-01-13 19:00
 **/
public class User implements IUser {

	@Override
	public String say(String str) {
		System.out.println("say:"+str);
		return str;
	}

	@Override
	public String eat(String str) {
		System.out.println("eat:"+str);
		return str;
	}
}
