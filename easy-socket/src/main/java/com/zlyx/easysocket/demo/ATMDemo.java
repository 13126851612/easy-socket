package com.zlyx.easysocket.demo;

import com.zlyx.easysocket.annotations.MsgHandler;
import com.zlyx.easysocket.annotations.MsgHandler.Level;
import com.zlyx.easysocket.interfaces.IMsgHandler;

/**
 * @Auth 赵光
 * @Describle
 * @2018年12月22日 下午5:24:41
 */
@MsgHandler(level = Level.ATM, port = 10001, todo = { "AIO_TCP使用案例" })
public class ATMDemo implements IMsgHandler{

	@Override
	public String doHandler(String data) throws Exception {
		System.out.println("接收到消息了"+data);
		return this.hashCode()+":"+data;
	}
}
