webpackJsonp([19], {
	"+skl": function(t, e) {},
	"CpT/": function(t, e) {},
	DfDl: function(t, e) {
		e.install = function(t, e) {
			t.prototype.auth = function() {
				if ("login" !== this.$store.state.user.status) return this.$store.commit("logoutupdate"), !0
			}
		}
	},
	Lteb: function(t, e) {},
	NHnr: function(t, e, n) {
		"use strict";
		Object.defineProperty(e, "__esModule", {
			value: !0
		});
		var a = n("7+uW"),
			i = n("BTaQ"),
			o = n.n(i),
			s = (n("+skl"), n("ytdl")),
			r = n.n(s),
			c = n("mtWM"),
			u = n.n(c),
			l = (n("162o"), {
				data: function() {
					return {
						weixinShow: !1
					}
				},
				computed: {
					config: function() {
						return this.$store.state.config
					},
					mail: function() {
						return this.$store.state.config.mail
					},
					qq: function() {
						return this.$store.state.config.qq
					},
					weixin: function() {
						return this.$store.state.config.weixin
					},
					info: function() {
						return this.$store.state.config.termid.page.info
					},
					theme: function() {
						return this.$store.state.config.termid.page.theme
					}
				},
				watch: {
					$route: function(t, e) {
						t.path && _hmt.push(["_trackPageview", t.fullPath])
					}
				},
				methods: {
					weixinShowToggle: function() {
						this.weixinShow = !this.weixinShow
					},
					gotoInfo: function() {
						this.$router.push({
							path: "/posts/" + this.info
						})
					},
					gotoApp: function() {
						this.$router.push({
							path: "/posts/" + this.theme
						})
					},
					tongji: function() {
						var t = document.createElement("script");
						t.innerHTML = '\n              var _hmt = _hmt || [];\n              (function() {\n                var hm = document.createElement("script");\n                hm.src = "' + this.config.tongji + '";\n                var s = document.getElementsByTagName("script")[0]; \n                s.parentNode.insertBefore(hm, s);\n              })();\n              ', document.body.appendChild(t)
					}
				},
				mounted: function() {
					this.tongji()
				}
			}),
			m = {
				render: function() {
					var t = this,
						e = t.$createElement,
						n = t._self._c || e;
					return n("footer", [n("div", {
						staticClass: "container footer-container"
					}, [n("div", {
						staticClass: "qinmei-footer-left"
					}, [n("div", {
						staticClass: "footer-left-logo"
					}, [t._v(t._s(t.config.name))]), t._v(" "), n("div", {
						staticClass: "footer-left-text"
					}, [n("p", [t._v(t._s(t.config.slogan))])]), t._v(" "), t._m(0)]), t._v(" "), n("div", {
						staticClass: "qinmei-footer-right"
					}, [n("div", {
						staticClass: "footer-right-title"
					}, [t._v("官方")]), t._v(" "), n("div", {
						staticClass: "footer-right-link"
					}, [n("a", {
						on: {
							click: t.gotoInfo
						}
					}, [t._v("关于我们")]), t._v(" "), n("a", {
						on: {
							click: t.gotoApp
						}
					}, [t._v("APP下载")])]), t._v(" "), n("div", {
						staticClass: "footer-right-icon"
					}, [n("a", {
						staticClass: "weixin-icon",
						attrs: {
							title: "微信公众号"
						},
						on: {
							mouseover: t.weixinShowToggle,
							mouseout: t.weixinShowToggle
						}
					}, [n("i", {
						staticClass: "iconfont icon-xiangmulan-weixinhao"
					}), t._v(" "), n("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: t.weixinShow,
							expression: "weixinShow"
						}],
						staticClass: "weixin-icon-img"
					}, [n("img", {
						attrs: {
							src: t.weixin,
							alt: ""
						}
					})])]), t._v(" "), n("a", {
						attrs: {
							href: t.qq,
							title: "QQ群"
						}
					}, [n("i", {
						staticClass: "iconfont icon-qq"
					})]), t._v(" "), n("a", {
						attrs: {
							href: t.mail,
							title: "邮件"
						}
					}, [n("i", {
						staticClass: "iconfont icon-ziyuan"
					})])])])])])
				},
				staticRenderFns: [function() {
					var t = this.$createElement,
						e = this._self._c || t;
					return e("div", {
						staticClass: "footer-left-text"
					}, [e("p", [this._v("建立初衷仅仅作为个人项目，并不包含任何商业信息。")]), this._v(" "), e("p", [this._v("本站不提供任何视听上传服务，所有内容均来自于互联网")])])
				}]
			};
		var d = n("VU/8")(l, m, !1, function(t) {
				n("lr11")
			}, null, null).exports,
			p = {
				data: function() {
					return {
						headShow: !0,
						searchtext: "",
						navList: [{
							name: "新番",
							link: "/new"
						}, {
							name: "推荐",
							link: "/recommend"
						}, {
							name: "专题",
							link: "/topic"
						}, {
							name: "动态",
							link: "/discuss"
						}, {
							name: "全部",
							link: "/all"
						}, {
							name: "搞笑",
							link: "/animatekind/fun"
						}, {
							name: "战斗",
							link: "/animatekind/fight"
						}, {
							name: "日常",
							link: "/animatekind/daily"
						}, {
							name: "致郁",
							link: "/animatekind/depress"
						}, {
							name: "治愈",
							link: "/animatekind/cure"
						}, {
							name: "异界",
							link: "/animatekind/world"
						}]
					}
				},
				computed: {
					searchList: function() {
						return this.$store.state.config.search_modules
					}
				},
				watch: {
					$route: function() {
						this.closetips()
					}
				},
				methods: {
					showToggle: function() {
						this.headShow = !this.headShow
					},
					goTo: function(t) {
						this.$router.push({
							path: t
						})
					},
					closetips: function() {
						0 == this.headShow && (this.headShow = !0)
					},
					search: function() {
						this.$router.push({
							path: "/search",
							query: {
								s: this.searchtext
							}
						}), this.searchtext = ""
					}
				},
				mounted: function() {},
				directives: {
					focus: {
						inserted: function(t, e) {
							e.value ? t.focus() : t.blur()
						},
						componentUpdated: function(t, e) {
							e.value ? t.focus() : t.blur()
						}
					},
					clickOutside: {
						bind: function(t, e, n) {
							function a(n) {
								if (t.contains(n.target)) return !1;
								e.expression && e.value(n)
							}
							t.__vueClickOutside__ = a, document.addEventListener("click", a)
						},
						unbind: function(t, e) {
							document.removeEventListener("click", t.__vueClickOutside__), delete t.__vueClickOutside__
						}
					}
				}
			},
			h = {
				render: function() {
					var t = this,
						e = t.$createElement,
						n = t._self._c || e;
					return n("div", {
						staticClass: "header-position"
					}, [n("div", {
						staticClass: "header"
					}, [n("div", {
						staticClass: "container"
					}, [n("div", {
						directives: [{
							name: "clickOutside",
							rawName: "v-clickOutside",
							value: t.closetips,
							expression: "closetips"
						}],
						staticClass: "container-head"
					}, [n("div", {
						staticClass: "header-side",
						on: {
							click: function(e) {
								return t.goTo("/index")
							}
						}
					}, [n("i", {
						staticClass: "iconfont icon-zhinengyouhua"
					})]), t._v(" "), n("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: !0 === t.headShow,
							expression: "headShow === true"
						}],
						staticClass: "header-main"
					}, [t._l(t.navList, function(e, a) {
						return n("router-link", {
							key: a,
							staticClass: "main-list",
							attrs: {
								tag: "div",
								to: {
									path: e.link
								}
							}
						}, [t._v("\n                  " + t._s(e.name) + "\n              ")])
					}), t._v(" "), n("div", {
						staticClass: "main-list",
						on: {
							click: t.showToggle
						}
					}, [n("i", {
						staticClass: "iconfont icon-sousuo"
					})])], 2), t._v(" "), n("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: !1 === t.headShow,
							expression: "headShow === false"
						}],
						staticClass: "header-main"
					}, [n("div", {
						staticClass: "search-input"
					}, [n("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: t.searchtext,
							expression: "searchtext"
						}, {
							name: "focus",
							rawName: "v-focus",
							value: 0 == t.headShow,
							expression: "headShow == false"
						}],
						attrs: {
							type: "text",
							placeholder: "darling in the franxx"
						},
						domProps: {
							value: t.searchtext
						},
						on: {
							keyup: function(e) {
								return !e.type.indexOf("key") && t._k(e.keyCode, "enter", 13, e.key, "Enter") ? null : t.search(e)
							},
							input: function(e) {
								e.target.composing || (t.searchtext = e.target.value)
							}
						}
					}), t._v(" "), n("div", {
						staticClass: "input-main"
					}, [n("div", {
						staticClass: "search-hot"
					}, [t._v("热门搜索")]), t._v(" "), t._l(t.searchList, function(e, a) {
						return n("router-link", {
							key: a,
							staticClass: "search-list",
							attrs: {
								tag: "div",
								to: {
									path: e.qinmei_search_slug
								}
							}
						}, [t._v("\n                        " + t._s(e.qinmei_search_title) + "\n                    ")])
					})], 2)]), t._v(" "), n("div", {
						staticClass: "main-list",
						on: {
							click: t.showToggle
						}
					}, [n("i", {
						staticClass: "iconfont icon-guanbi1"
					})])]), t._v(" "), n("div", {
						staticClass: "header-side",
						on: {
							click: function(e) {
								return t.goTo("/auth/login")
							}
						}
					}, [n("i", {
						staticClass: "iconfont icon-modx"
					})])])])])])
				},
				staticRenderFns: []
			};
		var f = n("VU/8")(p, h, !1, function(t) {
				n("Lteb")
			}, "data-v-be69b652", null).exports,
			g = n("mvHQ"),
			v = n.n(g),
			w = n("cJ47"),
			_ = {
				data: function() {
					return {
						user: {
							name: "",
							pass: ""
						},
						passshow: !1
					}
				},
				computed: {
					show: function() {
						return this.$store.state.islogout
					}
				},
				methods: {
					showtoggle: function() {
						this.$store.commit("logoutupdate")
					},
					onSubmit: function() {
						var t = this;
						u()({
							method: "post",
							data: {
								username: this.user.name,
								password: this.user.pass
							},
							url: window.config.baseurl + "/wp-json/jwt-auth/v1/token"
						}).then(function(e) {
							localStorage.token = v()(e.data.token), t.$store.commit("tokenupdate");
							var n = r()(e.data.token).data.user.id;
							Object(w.a)({
								method: "get",
								url: "/users/" + n,
								headers: {
									Authorization: "Bearer " + e.data.token
								}
							}).then(function(e) {
								t.$Notice.success({
									title: "登录成功"
								}), localStorage.user = v()(e.data), t.$store.commit("userupdate"), t.$store.commit("logoutupdate"), t.user.name = null, t.user.pass = null
							}).catch(function(e) {
								t.$Notice.error({
									title: "出错了,请稍后重试"
								})
							})
						}).catch(function(e) {
							e.response && t.$Notice.error({
								title: e.response.data.message
							})
						})
					}
				}
			},
			b = {
				render: function() {
					var t = this,
						e = t.$createElement,
						n = t._self._c || e;
					return 1 == t.show ? n("div", {
						staticClass: "auth-bg",
						on: {
							click: t.showtoggle
						}
					}, [n("div", {
						staticClass: "auth-model-pc",
						on: {
							click: function(t) {
								t.stopPropagation()
							}
						}
					}, [n("div", {
						staticClass: "model-container"
					}, [n("div", {
						staticClass: "close-button",
						on: {
							click: function(e) {
								return e.stopPropagation(), t.showtoggle(e)
							}
						}
					}, [n("Icon", {
						attrs: {
							type: "md-close",
							color: "white"
						}
					})], 1), t._v(" "), t._m(0), t._v(" "), n("div", {
						staticClass: "model-middle"
					}, [n("form", {
						on: {
							submit: function(e) {
								return e.preventDefault(), t.onSubmit(e)
							}
						}
					}, [n("input", {
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
					}), t._v(" "), n("div", {
						staticClass: "pass-con"
					}, [0 == t.passshow ? n("input", {
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
					}) : n("input", {
						directives: [{
							name: "model",
							rawName: "v-model",
							value: t.user.pass,
							expression: "user.pass"
						}],
						attrs: {
							type: "text",
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
					}), t._v(" "), n("span", {
						staticClass: "pass-toggle",
						on: {
							click: function(e) {
								t.passshow = !t.passshow
							}
						}
					}, [1 == t.passshow ? n("Icon", {
						attrs: {
							type: "md-eye"
						}
					}) : n("Icon", {
						attrs: {
							type: "md-eye-off"
						}
					})], 1)]), t._v(" "), n("router-link", {
						staticClass: "form-reset-pass",
						attrs: {
							tag: "span",
							to: {
								path: "/auth/reset"
							}
						}
					}, [t._v("忘记密码?")]), t._v(" "), n("input", {
						staticClass: "submit",
						attrs: {
							type: "submit",
							name: "submit",
							value: "登录"
						}
					})], 1)]), t._v(" "), n("div", {
						staticClass: "model-footer"
					}, [n("span", [t._v("没有账号?")]), t._v(" "), n("router-link", {
						staticClass: "form-footer-register",
						attrs: {
							tag: "span",
							to: {
								path: "/auth/register"
							}
						}
					}, [t._v("现在注册")])], 1)])])]) : t._e()
				},
				staticRenderFns: [function() {
					var t = this.$createElement,
						e = this._self._c || t;
					return e("div", {
						staticClass: "model-header"
					}, [e("p", [this._v("登录账号才能使用哦")])])
				}]
			};
		var k = n("VU/8")(_, b, !1, function(t) {
			n("CpT/")
		}, null, null).exports;
		a.default.use(o.a);
		a.default.use(o.a);
		var y = {
				components: {
					Nav: f,
					Foot: d,
					Auth: k
				},
				computed: {
					propshow: function() {
						return this.$store.state.islogout
					},
					config: function() {
						return this.$store.state.config
					}
				},
				methods: {
					loginconfirm: function() {
						if (localStorage.token) {
							var t = JSON.parse(localStorage.token),
								e = r()(t),
								n = (new Date).getTime() / 1e3;
							e.exp > n && (localStorage.user ? (this.$store.commit("userupdate"), this.$store.commit("tokenupdate")) : localStorage.token = "")
						}
					}
				},
				created: function() {
					this.loginconfirm(), this.$store.dispatch("testwebconfig")
				},
				beforeUpdated: function() {
					this.loginconfirm()
				},
				beforeDestroy: function() {}
			},
			C = {
				render: function() {
					var t = this.$createElement,
						e = this._self._c || t;
					return 0 !== Object.keys(this.config).length ? e("div", [e("Nav"), this._v(" "), e("main", [e("router-view")], 1), this._v(" "), e("Foot"), this._v(" "), e("Auth")], 1) : this._e()
				},
				staticRenderFns: []
			};
		var x = n("VU/8")(y, C, !1, function(t) {
				n("gKbs")
			}, null, null).exports,
			S = n("/ocq"),
			$ = n("l+I4");
		a.default.use(o.a), a.default.use(S.a);
		var O = {
				mode: "history",
				routes: [{
					path: "/new",
					meta: {
						title: "新番列表"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(8)]).then(function() {
							var e = [n("Y6A4")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/index",
					meta: {
						title: "一个在线动漫播放网站"
					},
					component: function(t) {
						return n.e(4).then(function() {
							var e = [n("8hXn")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/recommend",
					meta: {
						title: "站长推荐"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(16)]).then(function() {
							var e = [n("we1U")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/discuss",
					meta: {
						title: "动态讨论"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(7)]).then(function() {
							var e = [n("WMEK")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/all",
					meta: {
						title: "全部番剧"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(10)]).then(function() {
							var e = [n("6Htx")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/topic",
					meta: {
						title: "专题图文"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(6)]).then(function() {
							var e = [n("cOqS")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/animatekind/:cat",
					meta: {
						title: "分类"
					},
					component: function(t) {
						return Promise.all([n.e(0), n.e(9)]).then(function() {
							var e = [n("uEKL")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/animate/:id",
					meta: {
						title: "动漫页面"
					},
					name: "animate",
					component: function(t) {
						return Promise.all([n.e(0), n.e(1)]).then(function() {
							var e = [n("bP5g")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/search",
					meta: {
						title: "搜索页面"
					},
					name: "search",
					component: function(t) {
						return Promise.all([n.e(0), n.e(13)]).then(function() {
							var e = [n("2QH8")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/posts/:id",
					meta: {
						title: "长文分析"
					},
					name: "post",
					component: function(t) {
						return Promise.all([n.e(0), n.e(2)]).then(function() {
							var e = [n("WUAQ")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/play",
					meta: {
						title: "播放"
					},
					name: "play",
					component: function(t) {
						return Promise.all([n.e(0), n.e(5)]).then(function() {
							var e = [n("SHt1")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					}
				}, {
					path: "/auth",
					children: [{
						path: "login",
						meta: {
							title: "用户登录"
						},
						component: function(t) {
							return n.e(15).then(function() {
								var e = [n("KoTh")];
								t.apply(null, e)
							}.bind(this)).catch(n.oe)
						}
					}, {
						path: "register",
						meta: {
							title: "用户注册"
						},
						component: function(t) {
							return n.e(17).then(function() {
								var e = [n("uuoo")];
								t.apply(null, e)
							}.bind(this)).catch(n.oe)
						}
					}, {
						path: "reset",
						meta: {
							title: "发送邮件"
						},
						component: function(t) {
							return n.e(12).then(function() {
								var e = [n("dpm1")];
								t.apply(null, e)
							}.bind(this)).catch(n.oe)
						}
					}, {
						path: "validate",
						meta: {
							title: "重置密码"
						},
						component: function(t) {
							return n.e(14).then(function() {
								var e = [n("6cQN")];
								t.apply(null, e)
							}.bind(this)).catch(n.oe)
						}
					}],
					name: "auth",
					component: function(t) {
						return n.e(11).then(function() {
							var e = [n("iqWT")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					},
					beforeEnter: function(t, e, n) {
						"login" !== $.a.state.user.status ? n() : n({
							path: "/user"
						})
					}
				}, {
					path: "/user",
					meta: {
						title: "用户中心"
					},
					name: "user",
					component: function(t) {
						return Promise.all([n.e(0), n.e(3)]).then(function() {
							var e = [n("nXOw")];
							t.apply(null, e)
						}.bind(this)).catch(n.oe)
					},
					beforeEnter: function(t, e, n) {
						"login" == $.a.state.user.status ? n() : n({
							path: "/auth/login"
						})
					}
				}, {
					path: "*",
					redirect: "/index"
				}]
			},
			N = new S.a(O);
		N.afterEach(function(t, e, n) {
			o.a.LoadingBar.finish(), window.scrollTo(0, 0)
		}), N.beforeEach(function(t, e, n) {
			o.a.LoadingBar.start(), window.document.title = window.config.basename + " - " + t.meta.title, n()
		});
		var P = N,
			T = n("DfDl"),
			q = n.n(T);
		a.default.use(q.a), a.default.config.productionTip = !1, new a.default({
			el: "#app",
			router: P,
			store: $.a,
			components: {
				App: x
			},
			template: "<App/>"
		})
	},
	cJ47: function(t, e, n) {
		"use strict";
		var a = n("mtWM"),
			i = n.n(a),
			o = n("l+I4"),
			s = n("L6bb"),
			r = (n.n(s), i.a.create({
				baseURL: window.config.baseurl + "/wp-json/wp/v2/",
				timeout: "30000",
				headers: {
					"Content-Type": "application/json;"
				}
			}));
		r.interceptors.request.use(function(t) {
			return "" != o.a.state.token && (t.headers.Authorization = "Bearer " + o.a.state.token), t
		}), e.a = r
	},
	gKbs: function(t, e) {},
	"l+I4": function(t, e, n) {
		"use strict";
		var a, i = n("fZjL"),
			o = n.n(i),
			s = n("mvHQ"),
			r = n.n(s),
			c = n("bOdI"),
			u = n.n(c),
			l = n("7+uW"),
			m = n("NYxO"),
			d = n("cJ47");
		l.default.use(m.a);
		var p = new m.a.Store({
			state: {
				token: "",
				islogout: !1,
				user: (a = {
					name: "",
					email: "",
					avatar: "",
					bgimg: "",
					level: "",
					aid: "",
					sorce: ""
				}, u()(a, "level", ""), u()(a, "desc", ""), u()(a, "status", "logout"), a),
				config: {},
				animate: {
					time: {
						day1: [],
						day3: [],
						day2: [],
						day5: [],
						day6: [],
						day4: [],
						day7: [],
						recommend: [],
						top: [],
						scroll: [],
						world: [],
						fight: [],
						fun: [],
						daily: [],
						cure: [],
						depress: [],
						all: []
					},
					rate: {
						recommend: [],
						world: [],
						fight: [],
						fun: [],
						daily: [],
						cure: [],
						depress: [],
						all: []
					},
					total: {
						recommend: 0,
						world: 0,
						fight: 0,
						fun: 0,
						daily: 0,
						cure: 0,
						depress: 0,
						all: 0
					}
				}
			},
			mutations: {
				userupdate: function(t) {
					var e = JSON.parse(localStorage.user);
					t.user.name = e.name, t.user.email = e.email, t.user.avatar = e.qinmei.vue_avatar, t.user.bgimg = e.qinmei.vue_backimg, t.user.level = e.node.level, t.user.aid = e.node.aid, t.user.sorce = e.node.sorce, t.user.desc = e.description, t.user.status = "login"
				},
				tokenupdate: function(t) {
					var e = JSON.parse(localStorage.token);
					t.token = e
				},
				logoutupdate: function(t) {
					t.islogout = !t.islogout
				},
				configupdate: function(t, e) {
					t.config = e
				},
				catupdate: function(t, e) {
					t.animate.time[e.name] = e.list, t.animate.total[e.name] = e.total
				},
				rateupdate: function(t, e) {
					t.animate.rate[e.name] = e.list
				},
				savewebconfig: function(t) {
					var e = new Date;
					localStorage.config = r()({
						time: e.getTime(),
						data: t.config
					})
				},
				initwebconfig: function(t) {
					t.config = JSON.parse(localStorage.config).data
				}
			},
			actions: {
				getConfig: function(t) {
					var e = t.dispatch,
						n = t.commit;
					Object(d.a)({
						method: "get",
						url: "/qinmei/config"
					}).then(function(t) {
						n("configupdate", t.data), n("savewebconfig"), e("testwebdata")
					})
				},
				getanimatecat: function(t) {
					var e = t.state,
						n = t.commit,
						a = function(t) {
							Object(d.a)({
								method: "get",
								url: "/animate",
								params: {
									animatecat: e.config.termid.cat[t],
									per_page: 30,
									page: 1
								}
							}).then(function(e) {
								n("catupdate", {
									name: t,
									list: e.data,
									total: parseInt(e.headers["x-wp-total"])
								})
							})
						};
					for (var i in e.config.termid.cat) a(i)
				},
				getanimatekind: function(t) {
					var e = t.state,
						n = t.commit,
						a = function(t) {
							Object(d.a)({
								method: "get",
								url: "/animate",
								params: {
									animatekind: e.config.termid.kind[t],
									per_page: 30,
									page: 1
								}
							}).then(function(e) {
								n("catupdate", {
									name: t,
									list: e.data,
									total: parseInt(e.headers["x-wp-total"])
								})
							})
						};
					for (var i in e.config.termid.kind) a(i)
				},
				getanimateall: function(t) {
					t.state;
					var e = t.commit;
					Object(d.a)({
						method: "get",
						url: "/animate",
						params: {
							per_page: 30,
							page: 1
						}
					}).then(function(t) {
						e("catupdate", {
							name: "all",
							list: t.data,
							total: parseInt(t.headers["x-wp-total"])
						})
					})
				},
				getanimaterate: function(t) {
					var e = t.state,
						n = t.commit,
						a = function(t) {
							var a = "";
							a = "all" == t ? "/animate?orderby=baseinfo_rate" : "recommend" == t ? "/animate?orderby=baseinfo_rate&animatecat=" + e.config.termid.cat[t] : "/animate?orderby=baseinfo_rate&animatekind=" + e.config.termid.kind[t], Object(d.a)({
								method: "get",
								url: a,
								params: {
									per_page: 30,
									page: 1
								}
							}).then(function(e) {
								n("rateupdate", {
									name: t,
									list: e.data
								})
							})
						};
					for (var i in e.animate.rate) a(i)
				},
				updatepagerate: function(t, e) {
					var n = t.state,
						a = t.commit,
						i = "";
					i = "all" == e.type ? "/animate?orderby=baseinfo_rate" : "recommend" == e.type ? "/animate?orderby=baseinfo_rate&animatecat=" + n.config.termid.cat[e.type] : "/animate?orderby=baseinfo_rate&animatekind=" + n.config.termid.kind[e.type], Object(d.a)({
						method: "get",
						url: i,
						params: {
							per_page: 30,
							page: e.current
						}
					}).then(function(t) {
						a("rateupdate", {
							name: e.type,
							list: t.data
						})
					})
				},
				updatepagecat: function(t, e) {
					var n = t.state,
						a = t.commit,
						i = "";
					i = "recommend" == e.type ? "/animate?animatecat=" + n.config.termid.cat[e.type] : "/animate?animatekind=" + n.config.termid.kind[e.type], Object(d.a)({
						method: "get",
						url: i,
						params: {
							per_page: 30,
							page: e.current
						}
					}).then(function(t) {
						a("catupdate", {
							name: e.type,
							list: t.data,
							total: parseInt(t.headers["x-wp-total"])
						})
					})
				},
				testwebconfig: function(t) {
					var e = t.dispatch,
						n = t.commit;
					if (localStorage.getItem("config")) {
						var a = JSON.parse(localStorage.config);
						(new Date).getTime() - 6048e5 - a.time < 0 && 0 !== o()(a.data).length ? (n("initwebconfig"), e("testwebdata")) : e("getConfig")
					} else e("getConfig")
				},
				testwebdata: function(t) {
					var e = t.dispatch;
					t.commit;
					e("getanimatecat"), e("getanimatekind"), e("getanimaterate"), e("getanimateall")
				}
			}
		});
		e.a = p
	},
	lr11: function(t, e) {}
}, ["NHnr"]);