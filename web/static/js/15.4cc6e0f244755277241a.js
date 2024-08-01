webpackJsonp([15], {
	KoTh: function(t, e, s) {
		"use strict";
		Object.defineProperty(e, "__esModule", {
			value: !0
		});
		var n = s("mvHQ"),
			a = s.n(n),
			r = s("mtWM"),
			o = s.n(r),
			i = s("ytdl"),
			u = s.n(i),
			c = s("cJ47"),
			l = {
				data: function() {
					return {
						user: {
							name: "",
							pass: ""
						}
					}
				},
				methods: {
					info: function(t) {
						this.$Notice.info({
							title: "提示",
							desc: t
						})
					},
					success: function(t) {
						this.$Notice.success({
							title: "登录成功",
							desc: t
						})
					},
					warning: function(t) {
						this.$Notice.warning({
							title: "警告",
							desc: t
						})
					},
					error: function(t) {
						this.$Notice.error({
							title: "登录错误",
							desc: t
						})
					},
					onSubmit: function() {
						var t = this;
						o()({
							method: "post",
							data: {
								username: this.user.name,
								password: this.user.pass
							},
							url: window.config.baseurl + "/wp-json/jwt-auth/v1/token"
						}).then(function(e) {
							t.success("即将进入用户中心"), localStorage.token = a()(e.data.token), t.$store.commit("tokenupdate");
							var s = u()(e.data.token).data.user.id;
							Object(c.a)({
								method: "get",
								url: "/users/" + s,
								headers: {
									Authorization: "Bearer " + e.data.token
								}
							}).then(function(e) {
								localStorage.user = a()(e.data), t.$store.commit("userupdate"), t.$router.push({
									path: "/user"
								})
							}).catch(function(e) {
								t.error("出错了,请稍后重试")
							})
						}).catch(function(e) {
							e.response && t.error(e.response.data.message)
						})
					}
				},
				mounted: function() {
					"login" == this.$store.state.user.status && this.$router.push({
						path: "/user"
					})
				}
			},
			m = {
				render: function() {
					var t = this,
						e = t.$createElement,
						s = t._self._c || e;
					return s("div", {
						staticClass: "login-box"
					}, [t._m(0), t._v(" "), s("div", {
						staticClass: "login-form"
					}, [s("form", {
						on: {
							submit: function(e) {
								return e.preventDefault(), t.onSubmit(e)
							}
						}
					}, [s("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: t.user.name,
							expression: "user.name"
						}],
						attrs: {
							type: "text",
							placeholder: "用户名或邮箱"
						},
						domProps: {
							value: t.user.name
						},
						on: {
							input: function(e) {
								e.target.composing || t.$set(t.user, "name", e.target.value)
							}
						}
					}), t._v(" "), s("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: t.user.pass,
							expression: "user.pass"
						}],
						attrs: {
							type: "password",
							placeholder: "用户密码"
						},
						domProps: {
							value: t.user.pass
						},
						on: {
							input: function(e) {
								e.target.composing || t.$set(t.user, "pass", e.target.value)
							}
						}
					}), t._v(" "), s("input", {
						staticClass: "submit",
						attrs: {
							type: "submit",
							name: "submit",
							value: "登录"
						}
					})])]), t._v(" "), s("div", {
						staticClass: "login-link"
					}, [s("router-link", {
						attrs: {
							tag: "span",
							to: {
								path: "/auth/register"
							}
						}
					}, [t._v("注册")]), t._v(" "), s("router-link", {
						attrs: {
							tag: "span",
							to: {
								path: "/auth/reset"
							}
						}
					}, [t._v("忘记密码")])], 1)])
				},
				staticRenderFns: [function() {
					var t = this.$createElement,
						e = this._self._c || t;
					return e("div", {
						staticClass: "logo"
					}, [e("i", {
						staticClass: "iconfont icon-zhinengyouhua"
					})])
				}]
			};
		var d = s("VU/8")(l, m, !1, function(t) {
			s("mCDy")
		}, null, null);
		e.default = d.exports
	},
	mCDy: function(t, e) {}
});