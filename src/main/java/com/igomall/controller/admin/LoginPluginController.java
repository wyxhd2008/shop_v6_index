/*
 * Copyright 2008-2018 shopxx.net. All rights reserved.
 * Support: localhost
 * License: localhost/license
 * FileId: 1zT+szJg6h1PNeQ5JuKzkD3hvPoJ0H3p
 */
package com.igomall.controller.admin;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.igomall.service.PluginService;

/**
 * Controller - 登录插件
 * 
 * @author 好源++ Team
 * @version 6.1
 */
@Controller("adminLoginPluginController")
@RequestMapping("/admin/login_plugin")
public class LoginPluginController extends BaseController {

	@Resource
	private PluginService pluginService;

	/**
	 * 列表
	 */
	@GetMapping("/list")
	public String list(ModelMap model) {
		model.addAttribute("loginPlugins", pluginService.getLoginPlugins());
		return "admin/login_plugin/list";
	}

}