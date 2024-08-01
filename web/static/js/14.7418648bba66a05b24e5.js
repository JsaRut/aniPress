webpackJsonp([14], {
	"6TsG": function(e, s) {},
	"6cQN": function(e, s, t) {
		"use strict";
		Object.defineProperty(s, "__esModule", {
			value: !0
		});
		var r = t("cJ47"),
			a = {
				data: function() {
					return {
						user: {
							key: "",
							pass: "",
							password: ""
						}
					}
				},
				computed: {
					username: function() {
						return this.$route.query.username
					}
				},
				methods: {
					info: function(e) {
						this.$Notice.info({
							title: "重置提示",
							desc: e
						})
					},
					success: function(e) {
						this.$Notice.success({
							title: "重置成功",
							desc: e
						})
					},
					warning: function(e) {
						this.$Notice.warning({
							title: "重置警告",
							desc: e
						})
					},
					error: function(e) {
						this.$Notice.error({
							title: "重置错误",
							desc: e
						})
					},
					onSubmit: function() {
						var e = this;
						this.user.pass.length < 8 || this.user.pass.length > 16 ? this.info("密码需大于8并小于16个字符") : /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[^]{8,16}$/.test(this.user.pass) ? this.user.pass === this.user.password ? Object(r.a)({
							method: "post",
							data: {
								user_login: this.username,
								key: this.user.key,
								user_password: this.user.password
							},
							url: "/users/validate_key"
						}).then(function(s) {
							switch (console.log(s), s.data.code) {
								case 200:
									e.success("重置成功,即将跳转登录界面"), setTimeout(function() {
										e.$router.push({
											path: "/auth/login"
										})
									}, 3e3);
									break;
								case 400:
									e.error("验证码错误，请重新尝试");
									break;
								case 401:
									e.error("用户名为空");
									break;
								case 402:
									e.error("验证码为空");
									break;
								case 403:
									e.error("密码为空");
									break;
								default:
									e.error("未知错误")
							}
						}).catch(function(s) {
							switch (s.response.data.code) {
								case 401:
									e.error("用户名为空");
									break;
								case 402:
									e.error("验证码为空");
									break;
								case 403:
									e.error("密码为空");
									break;
								default:
									e.error("未知错误")
							}
						}) : this.info("两次密码不一致") : this.info("密码需同时包含大写字母,小写字母以及数字")
					}
				},
				mounted: function() {}
			},
			o = {
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
							value: e.username,
							expression: "username"
						}],
						attrs: {
							type: "text",
							disabled: "",
							placeholder: "用户名"
						},
						domProps: {
							value: e.username
						},
						on: {
							input: function(s) {
								s.target.composing || (e.username = s.target.value)
							}
						}
					}), e._v(" "), t("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: e.user.key,
							expression: "user.key"
						}],
						attrs: {
							type: "text",
							placeholder: "请输入验证码"
						},
						domProps: {
							value: e.user.key
						},
						on: {
							input: function(s) {
								s.target.composing || e.$set(e.user, "key", s.target.value)
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
							value: "重置密码"
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
								path: "/auth/register"
							}
						}
					}, [e._v("注册")])], 1)])
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
		var n = t("VU/8")(a, o, !1, function(e) {
			t("6TsG")
		}, null, null);
		s.default = n.exports
	}
});