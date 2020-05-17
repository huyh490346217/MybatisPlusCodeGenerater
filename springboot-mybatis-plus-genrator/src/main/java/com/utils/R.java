package com.utils;


import com.consts.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 * @author luochaoqun
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private int code = CommonConstants.SUCCESS;

	@Getter
	@Setter
	private String msg = "success";


	@Getter
	@Setter
	private T data;

	public R() {
		super();
	}

	public R(T data) {
		super();
		this.data = data;
	}

	public R(T data, String msg) {
		super();
		this.data = data;
		this.msg = msg;
	}

	public R(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = CommonConstants.FAIL;
	}

	public static <T> R ok(T data) {
		return  R.builder().data(data).build();
	}

	public static <T> R exception(Throwable e) {
		return R.builder().code(CommonConstants.FAIL).msg(e.getMessage()).build();
	}

	public static R ok() {
		return ok(null);
	}

	public static R fail(int code) {
		return R.builder().code(code).build();
	}

	public static R fail(int code, String msg) {
		return R.builder().code(code).msg(msg).build();
	}

	public static <T> R fail() {
		return fail(CommonConstants.FAIL);
	}

	public static <T> R fail(String msg) {
		return fail(CommonConstants.FAIL,msg);
	}
}
