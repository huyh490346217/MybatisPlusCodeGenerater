package com.consts;

/**
 * @author
 */
public interface CommonConstants {
	/**
	 * header 中租户ID
	 */
	String TENANT_ID = "TENANT_ID";
	/**
	 * 删除
	 */
	Integer STATUS_DEL = 1;
	/**
	 * 正常
	 */
	Integer STATUS_NORMAL = 0;

	/**
	 * 锁定
	 */
	Integer STATUS_LOCK = 1;

	/**
	 * 菜单
	 */
	Integer MENU = 0;

	/**
	 * 编码
	 */
	String UTF8 = "UTF-8";

	/**
	 * 前端工程名
	 */
	String FRONT_END_PROJECT = "front-cloud-ui";

	/**
	 * 后端工程名
	 */
	String BACK_END_PROJECT = "back-cloud";

	/**
	 * 路由存放
	 */
	String ROUTE_KEY = "gateway_route_key";

	/**
	 * spring boot admin 事件key
	 */
	String EVENT_KEY = "event_key";

	/**
	 * 验证码前缀
	 */
	String DEFAULT_CODE_KEY = "DEFAULT_CODE_KEY_";

	/**
	 * 成功标记
	 */
	Integer SUCCESS = 0;
	/**
	 * 失败标记
	 */
	Integer FAIL = 1;

	/**
	 * 默认存储bucket
	 */
	String BUCKET_NAME = "bucket";
}
