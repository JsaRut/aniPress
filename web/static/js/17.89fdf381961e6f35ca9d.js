webpackJsonp([17], {
	LmIp: function(e, s) {},
	uuoo: function(e, s, t) {
		"use strict";
		Object.defineProperty(s, "__esModule", {
			value: !0
		});
		var r = t("cJ47"),
			a = {
				data: function() {
					return {
						user: {
							username: "",
							email: "",
							pass: "",
							password: ""
						}
					}
				},
				methods: {
					info: function(e) {
						this.$Notice.info({
							title: "注册提示",
							desc: e
						})
					},
					success: function(e) {
						this.$Notice.success({
							title: "注册成功",
							desc: e
						})
					},
					warning: function(e) {
						this.$Notice.warning({
							title: "注册警告",
							desc: e
						})
					},
					error: function(e) {
						this.$Notice.error({
							title: "注册错误",
							desc: e
						})
					},
					onSubmit: function() {
						var e = this;
						this.user.username.length < 6 ? this.info("用户名长度需大于6个字符") : /(com)$/.test(this.user.email) ? this.user.pass.length < 8 || this.user.pass.length > 16 ? this.info("密码需大于8并小于16个字符") : /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/.test(this.user.pass) ? this.user.pass === this.user.password ? Object(r.a)({
							method: "post",
							data: {
								username: this.user.username,
								email: this.user.email,
								password: this.user.password
							},
							url: "/users/register"
						}).then(function(s) {
							switch (s.data.code) {
								case 200:
									e.success("注册成功,即将跳转登录界面"), setTimeout(function() {
										e.$router.push({
											path: "/auth/login"
										})
									}, 3e3);
									break;
								default:
									e.error("未知错误")
							}
						}).catch(function(s) {
							switch (s.response.data.code) {
								case 400:
									e.error("用户名为空");
									break;
								case 401:
									e.error("邮箱为空");
									break;
								case 404:
									e.error("密码为空");
									break;
								case 406:
									/username/.test(s.response.data.message) ? e.error("该用户名已被注册") : e.error("该邮箱已被注册");
									break;
								default:
									e.error("未知错误")
							}
						}) : this.info("两次密码不一致") : this.info("密码需同时包含大写字母,小写字母以及数字") : this.info("邮箱暂时只支持com后缀")
					}
				},
				mounted: function() {}
			},
			i = {
				render: function() {
					var e = this,
						s = e.$createElement,
						t = e._self._c || s;
					return t("div", {
						staticClass: "login-box"
					}, [e._m(0), e._v(" "), t("div", {
						staticClass: "register-form"
					}, [t("form", {
						on: {
							submit: function(s) {
								return s.preventDefault(), e.onSubmit(s)
							}
						}
					}, [t("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: e.user.username,
							expression: "user.username"
						}],
						attrs: {
							type: "text",
							placeholder: "用户名"
						},
						domProps: {
							value: e.user.username
						},
						on: {
							input: function(s) {
								s.target.composing || e.$set(e.user, "username", s.target.value)
							}
						}
					}), e._v(" "), t("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: e.user.email,
							expression: "user.email"
						}],
						attrs: {
							type: "email",
							placeholder: "邮箱"
						},
						domProps: {
							value: e.user.email
						},
						on: {
							input: function(s) {
								s.target.composing || e.$set(e.user, "email", s.target.value)
							}
						}
					}), e._v(" "), t("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: e.user.pass,
							expression: "user.pass"
						}],
						attrs: {
							type: "password",
							placeholder: "输入密码"
						},
						domProps: {
							value: e.user.pass
						},
						on: {
							input: function(s) {
								s.target.composing || e.$set(e.user, "pass", s.target.value)
							}
						}
					}), e._v(" "), t("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: e.user.password,
							expression: "user.password"
						}],
						attrs: {
							type: "password",
							placeholder: "确认密码"
						},
						domProps: {
							value: e.user.password
						},
						on: {
							input: function(s) {
								s.target.composing || e.$set(e.user, "password", s.target.value)
							}
						}
					}), e._v(" "), t("input", {
						staticClass: "submit",
						attrs: {
							type: "submit",
							name: "submit",
							value: "注册"
						}
					})])]), e._v(" "), t("div", {
						staticClass: "login-link"
					}, [t("router-link", {
						attrs: {
							tag: "span",
							to: {
								path: "/auth/login"
							}
						}
					}, [e._v("登录")]), e._v(" "), t("router-link", {
						attrs: {
							tag: "span",
							to: {
								path: "/auth/reset"
							}
						}
					}, [e._v("忘记密码")])], 1)])
				},
				staticRenderFns: [function() {
					var e = this.$createElement,
						s = this._self._c || e;
					return s("div", {
						staticClass: "logo"
					}, [s("i", {
						staticClass: "iconfont icon-zhinengyouhua"
					})])
				}]
			};
		var n = t("VU/8")(a, i, !1, function(e) {
			t("LmIp")
		}, null, null);
		s.default = n.exports
	}
});