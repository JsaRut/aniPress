webpackJsonp([3], {
	RZ3j: function(t, s) {},
	U3pN: function(t, s) {},
	Wi3z: function(t, s) {},
	fIzw: function(t, s) {},
	hvoH: function(t, s) {},
	nXOw: function(t, s, a) {
		"use strict";
		Object.defineProperty(s, "__esModule", {
			value: !0
		});
		var e = a("mvHQ"),
			n = a.n(e),
			i = a("ytdl"),
			o = a.n(i),
			r = a("cJ47"),
			l = a("RsmR"),
			c = {
				props: ["avatar", "avatarWidth", "updatameda"],
				data: function() {
					return {
						showimg: "",
						visible: !1,
						token: "",
						loading: !1,
						imglist: []
					}
				},
				computed: {
					type: function() {
						return "3" == this.avatarWidth ? "avatar" : "15" == this.avatarWidth ? "backimg" : void 0
					}
				},
				methods: {
					showpic: function(t) {
						this.showimg = this.imglist[0], this.visible = !0
					},
					removeimg: function(t) {
						this.imglist.shift()
					},
					update: function(t) {
						var s = this;
						this.loading = !0;
						var a = t.target.files[0],
							e = new FormData;
						e.append("file", a);
						var n = this.type;
						e.append("key", n), Object(r.a)({
							url: "/media",
							method: "post",
							data: e
						}).then(function(t) {
							var a = t.data.source_url;
							s.imglist.push(a), s.$emit("updatameda", a, s.type), s.$Notice.success({
								title: "上传成功"
							}), s.loading = !1
						}).catch(function(t) {
							s.$Notice.error({
								title: "上传失败"
							}), s.loading = !1
						})
					},
					handleClick: function() {
						this.$refs.input.click()
					}
				},
				mounted: function() {
					this.imglist.push(this.avatar)
				}
			},
			u = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "upload-meta"
					}, [t._l(t.imglist, function(s) {
						return a("div", {
							staticClass: "img-list",
							style: {
								width: t.avatarWidth + "rem"
							}
						}, [a("div", {
							staticClass: "img-cover",
							style: {
								backgroundImage: "url(" + s + ")"
							}
						}, [a("div", {
							staticClass: "img-bg"
						}, [a("Icon", {
							attrs: {
								type: "ios-eye-outline"
							},
							nativeOn: {
								click: function(s) {
									return t.showpic()
								}
							}
						}), t._v(" "), a("Icon", {
							attrs: {
								type: "ios-trash-outline"
							},
							nativeOn: {
								click: function(s) {
									return t.removeimg()
								}
							}
						})], 1)])])
					}), t._v(" "), t.loading ? a("div", {
						staticClass: "img-loading"
					}, [a("Button", {
						attrs: {
							loading: ""
						}
					})], 1) : t._e(), t._v(" "), t.imglist.length < 1 ? a("div", {
						staticClass: "ivu-upload",
						staticStyle: {
							display: "inline-block",
							width: "3rem"
						},
						on: {
							click: t.handleClick
						}
					}, [a("div", {
						staticClass: "ivu-upload ivu-upload-drag"
					}, [a("input", {
						ref: "input",
						staticClass: "ivu-upload-input",
						attrs: {
							type: "file",
							multiple: "multiple",
							accept: "image/png,image/gif,image/jpeg"
						},
						on: {
							change: t.update
						}
					}), t._v(" "), t._m(0)])]) : t._e(), t._v(" "), a("Modal", {
						attrs: {
							title: "查看大图"
						},
						model: {
							value: t.visible,
							callback: function(s) {
								t.visible = s
							},
							expression: "visible"
						}
					}, [t.visible ? a("img", {
						staticStyle: {
							width: "100%"
						},
						attrs: {
							src: t.showimg
						}
					}) : t._e()])], 2)
				},
				staticRenderFns: [function() {
					var t = this.$createElement,
						s = this._self._c || t;
					return s("div", {
						staticStyle: {
							width: "3rem",
							height: "3rem",
							"line-height": "3rem"
						}
					}, [s("i", {
						staticClass: "ivu-icon ivu-icon-ios-camera",
						staticStyle: {
							"font-size": "20px"
						}
					})])
				}]
			};
		var m = a("VU/8")(c, u, !1, function(t) {
				a("hvoH")
			}, "data-v-5add4153", null).exports,
			d = {
				data: function() {
					return {
						longpost: 1,
						userdata: {
							longpost: {
								write: [],
								like: [],
								report: []
							}
						}
					}
				},
				filters: {
					poststatus: function(t) {
						switch (t) {
							case "pending":
								return "审核中";
							case "publish":
								return "已发布";
							default:
								return "被驳回"
						}
					}
				},
				methods: {
					getlongpost: function(t) {
						var s = this;
						Object(r.a)({
							method: "post",
							url: "/anime/longpost",
							data: {
								type: t
							}
						}).then(function(a) {
							null !== a.data && (s.userdata.longpost[t] = a.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					changeshow: function(t) {
						this.longpost = t
					},
					goto: function(t) {
						this.$router.push({
							name: "post",
							params: {
								id: t
							}
						})
					}
				},
				mounted: function() {
					this.getlongpost("write"), this.getlongpost("like"), this.getlongpost("report")
				}
			},
			v = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "user-longpost"
					}, [a("Menu", {
						attrs: {
							"active-name": "1",
							width: "160px"
						},
						on: {
							"on-select": t.changeshow
						}
					}, [a("MenuItem", {
						attrs: {
							name: "1"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-time"
						}
					}), t._v("\n            我的长文\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "2"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-heart"
						}
					}), t._v("\n            我的收藏\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "3"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-notifications-off"
						}
					}), t._v("\n            我的举报\n        ")], 1)], 1), t._v(" "), a("div", {
						staticClass: "panel-container"
					}, [a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 1 == t.longpost,
							expression: "longpost == 1"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.longpost.write.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无撰写记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, t._l(t.userdata.longpost.write, function(s) {
						return a("div", {
							staticClass: "longpost-list",
							on: {
								click: function(a) {
									return t.goto(s.id)
								}
							}
						}, [a("div", {
							staticClass: "longpost-bg",
							style: {
								backgroundImage: "url(" + s.headimg + ")"
							}
						}, [a("div", {
							staticClass: "longpost-bg-cover"
						}, [a("div", {
							staticClass: "longpost-title"
						}, [t._v("\n                    " + t._s(s.title) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-content"
						}, [t._v("\n                    " + t._s(s.content) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-header"
						}, [a("div", {
							staticClass: "longpost-author"
						}, [a("div", {
							staticClass: "longpost-author-avatar",
							style: {
								backgroundImage: "url(" + s.avatar + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "longpost-author-name"
						}, [t._v("\n                        " + t._s(s.author) + "\n                      ")])]), t._v(" "), a("div", {
							staticClass: "longpost-view"
						}, [a("span", [a("Icon", {
							attrs: {
								type: "ios-text"
							}
						}), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), a("span", [a("Icon", {
							attrs: {
								type: "md-eye"
							}
						}), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])]), t._v(" "), a("div", {
							staticClass: "longpost-footer"
						}, [t._v("\n                    " + t._s(t._f("poststatus")(s.status)) + "\n                  ")])])])])
					}), 0)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 2 == t.longpost,
							expression: "longpost == 2"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.longpost.like.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无收藏记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, t._l(t.userdata.longpost.like, function(s) {
						return a("div", {
							staticClass: "longpost-list",
							on: {
								click: function(a) {
									return t.goto(s.id)
								}
							}
						}, [a("div", {
							staticClass: "longpost-bg",
							style: {
								backgroundImage: "url(" + s.headimg + ")"
							}
						}, [a("div", {
							staticClass: "longpost-bg-cover"
						}, [a("div", {
							staticClass: "longpost-title"
						}, [t._v("\n                    " + t._s(s.title) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-content"
						}, [t._v("\n                    " + t._s(s.content) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-header"
						}, [a("div", {
							staticClass: "longpost-author"
						}, [a("div", {
							staticClass: "longpost-author-avatar",
							style: {
								backgroundImage: "url(" + s.avatar + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "longpost-author-name"
						}, [t._v("\n                        " + t._s(s.author) + "\n                      ")])]), t._v(" "), a("div", {
							staticClass: "longpost-view"
						}, [a("span", [a("Icon", {
							attrs: {
								type: "ios-text"
							}
						}), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), a("span", [a("Icon", {
							attrs: {
								type: "md-eye"
							}
						}), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])])])])])
					}), 0)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 3 == t.longpost,
							expression: "longpost == 3"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.longpost.report.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无举报记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, t._l(t.userdata.longpost.report, function(s) {
						return a("div", {
							staticClass: "longpost-list longpost-report",
							on: {
								click: function(a) {
									return t.goto(s.id)
								}
							}
						}, [a("div", {
							staticClass: "longpost-bg",
							style: {
								backgroundImage: "url(" + s.headimg + ")"
							}
						}, [a("div", {
							staticClass: "longpost-bg-cover"
						}, [a("div", {
							staticClass: "longpost-header"
						}, [a("div", {
							staticClass: "longpost-author"
						}, [a("div", {
							staticClass: "longpost-author-avatar",
							style: {
								backgroundImage: "url(" + s.avatar + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "longpost-author-name"
						}, [t._v("\n                        " + t._s(s.author) + "\n                      ")])]), t._v(" "), a("div", {
							staticClass: "longpost-view"
						}, [a("span", [a("Icon", {
							attrs: {
								type: "ios-text"
							}
						}), t._v("\n                        " + t._s(s.comment) + "\n                      ")], 1), t._v(" "), a("span", [a("Icon", {
							attrs: {
								type: "md-eye"
							}
						}), t._v("\n                        " + t._s(s.view) + "\n                      ")], 1)])])])]), t._v(" "), a("div", {
							staticClass: "longpost-report-main"
						}, [a("div", {
							staticClass: "longpost-report-title"
						}, [t._v("\n                    标题: " + t._s(s.title) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-report-status"
						}, [t._v("\n                    处理情况: " + t._s(s.status) + "\n                  ")]), t._v(" "), a("div", {
							staticClass: "longpost-report-reason"
						}, [t._v("\n                    举报原因: " + t._s(s.report) + "\n                  ")])])])
					}), 0)])])], 1)
				},
				staticRenderFns: []
			};
		var p = a("VU/8")(d, v, !1, function(t) {
				a("Wi3z")
			}, "data-v-04c9f252", null).exports,
			h = {
				data: function() {
					return {
						animate: 1,
						userdata: {
							animate: {
								history: [],
								like: [],
								upload: [],
								report: []
							}
						}
					}
				},
				filters: {
					poststatus: function(t) {
						switch (t) {
							case "pending":
								return "审核中";
							case "publish":
								return "已发布";
							default:
								return "被驳回"
						}
					}
				},
				computed: {
					listColor: function() {
						return function(t) {
							if (t) {
								var s = t.split("T")[0].split("-"),
									a = new Date;
								a.setFullYear(s[0]), a.setMonth(s[1] - 1), a.setDate(s[2]);
								var e = new Date,
									n = e.getDay();
								return "0" == n && (n = 7), e.setHours(0), e.setMinutes(0), e.setSeconds(0), a > e - 3600 * (n - 1) * 24 * 1e3 ? "#f25d8e" : void 0
							}
						}
					}
				},
				methods: {
					getanimatehistory: function() {
						var t = this;
						Object(r.a)({
							method: "post",
							url: "/userdata/info",
							data: {
								type: "animate_look_gone"
							}
						}).then(function(s) {
							s.data && (t.userdata.animate.history = s.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					getanimatelike: function() {
						var t = this;
						Object(r.a)({
							method: "post",
							url: "/userdata/info",
							data: {
								type: "animate_like"
							}
						}).then(function(s) {
							s.data && (t.userdata.animate.like = s.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					getanimateupload: function() {
						var t = this;
						Object(r.a)({
							method: "post",
							url: "/userdata/info",
							data: {
								type: "animate_look_for"
							}
						}).then(function(s) {
							s.data && (t.userdata.animate.upload = s.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					getanimatereport: function() {
						var t = this;
						Object(r.a)({
							method: "post",
							url: "/userdata/info",
							data: {
								type: "animate_report"
							}
						}).then(function(s) {
							s.data && (t.userdata.animate.report = s.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					changeshow: function(t) {
						this.animate = t
					},
					goTo: function(t) {
						this.$router.push({
							name: "animate",
							params: {
								id: t
							}
						})
					}
				},
				mounted: function() {
					this.getanimatehistory(), this.getanimatelike(), this.getanimateupload(), this.getanimatereport()
				}
			},
			_ = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "user-animate"
					}, [a("Menu", {
						attrs: {
							"active-name": "1",
							width: "160px"
						},
						on: {
							"on-select": t.changeshow
						}
					}, [a("MenuItem", {
						attrs: {
							name: "1"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-time"
						}
					}), t._v("\n            历史记录\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "2"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-heart"
						}
					}), t._v("\n            追番列表\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "3"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-cloud-upload"
						}
					}), t._v("\n            我的上传\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "4"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-notifications-off"
						}
					}), t._v("\n            举报投诉\n        ")], 1)], 1), t._v(" "), a("div", {
						staticClass: "panel-container"
					}, [a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 1 == t.animate,
							expression: "animate == 1"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.animate.history.length ? a("div", {
						staticClass: "panel-history"
					}, [t._v("\n          暂无历史记录\n        ")]) : a("div", {
						staticClass: "panel-history"
					}, t._l(t.userdata.animate.history, function(s) {
						return a("div", {
							staticClass: "panel-history-list",
							on: {
								click: function(a) {
									return t.goTo(s.slug)
								}
							}
						}, [a("div", {
							staticClass: "panel-history-pic",
							style: {
								backgroundImage: "url(" + s.img + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "panel-history-title"
						}, [t._v(t._s(s.title))]), t._v(" "), a("div", {
							staticClass: "panel-history-time"
						}, [t._v(t._s(s.time))]), t._v(" "), a("div", {
							staticClass: "panel-history-sort"
						}, [t._v(t._s(s.sort))])])
					}), 0)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 2 == t.animate,
							expression: "animate == 2"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.animate.like.length ? a("div", {
						staticClass: "panel-history"
					}, [t._v("\n          暂无追番记录\n        ")]) : a("div", {
						staticClass: "panel-history"
					}, t._l(t.userdata.animate.like, function(s) {
						return a("div", {
							staticClass: "panel-history-list",
							on: {
								click: function(a) {
									return t.goTo(s.slug)
								}
							}
						}, [a("div", {
							staticClass: "panel-history-pic",
							style: {
								backgroundImage: "url(" + s.img + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "panel-history-title"
						}, [t._v(t._s(s.title))]), t._v(" "), a("div", {
							staticClass: "panel-history-time"
						}, [a("Time", {
							attrs: {
								time: s.time
							}
						})], 1), t._v(" "), a("div", {
							staticClass: "panel-history-sort",
							style: {
								backgroundColor: t.listColor(s.time)
							}
						}, [t._v(t._s(s.sort))])])
					}), 0)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 3 == t.animate,
							expression: "animate == 3"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.animate.upload.length ? a("div", {
						staticClass: "panel-history"
					}, [t._v("\n          暂无上传记录\n        ")]) : a("div", {
						staticClass: "panel-history"
					}, t._l(t.userdata.animate.upload, function(s) {
						return a("div", {
							staticClass: "panel-history-list",
							on: {
								click: function(a) {
									return t.goTo(s.slug)
								}
							}
						}, [a("div", {
							staticClass: "panel-history-pic",
							style: {
								backgroundImage: "url(" + s.img + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "panel-history-title"
						}, [t._v(t._s(s.title))]), t._v(" "), a("div", {
							staticClass: "panel-history-time"
						}, [t._v(t._s(s.time))]), t._v(" "), a("div", {
							staticClass: "panel-history-sort"
						}, [t._v(t._s(t._f("poststatus")(s.status)))])])
					}), 0)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 4 == t.animate,
							expression: "animate == 4"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.animate.report.length ? a("div", {
						staticClass: "panel-history"
					}, [t._v("\n          暂无举报记录\n        ")]) : a("div", {
						staticClass: "panel-history"
					}, t._l(t.userdata.animate.report, function(s) {
						return a("div", {
							staticClass: "panel-report-list"
						}, [a("div", {
							staticClass: "panel-report-pic",
							style: {
								backgroundImage: "url(" + s.img + ")"
							},
							on: {
								click: function(a) {
									return t.goTo(s.slug)
								}
							}
						}, [a("div", {
							staticClass: "panel-report-status"
						}, [t._v("\n                " + t._s(s.status) + "\n              ")])]), t._v(" "), a("div", [a("div", {
							staticClass: "panel-report-title"
						}, [t._v("\n                标题: " + t._s(s.title) + "\n              ")]), t._v(" "), a("div", {
							staticClass: "panel-report-time"
						}, [t._v("\n                时间: " + t._s(s.time) + "\n              ")]), t._v(" "), a("div", {
							staticClass: "panel-report-sort"
						}, [t._v("\n                剧集: " + t._s(s.sort) + "\n              ")]), t._v(" "), a("div", {
							staticClass: "panel-report-content"
						}, [t._v("\n                举报原因: " + t._s(s.content) + "\n              ")])])])
					}), 0)])])], 1)
				},
				staticRenderFns: []
			};
		var g = a("VU/8")(h, _, !1, function(t) {
				a("RZ3j")
			}, "data-v-9860e054", null).exports,
			f = a("6My2"),
			C = (f.a, {
				props: ["commentlist"],
				components: {
					Commentmedia: f.a
				},
				data: function() {
					return {
						commentShow: -1,
						formdata: "",
						loading: !1,
						publishshow: !1,
						formloading: !1,
						content: "",
						imglist: [],
						visible: !1,
						showimg: ""
					}
				},
				filters: {
					usercontain: function(t) {
						if (t.length > 0 && localStorage.token) {
							var s = JSON.parse(localStorage.token),
								a = o()(s).data.user.id;
							return 1 == t.some(function(t) {
								return t == a
							}) ? "active" : ""
						}
					}
				},
				computed: {
					user: function() {
						return this.$store.state.user
					}
				},
				methods: {
					formsubmit: function(t, s, a) {
						var e = this;
						this.auth() || (this.loading = !0, Object(r.a)({
							method: "post",
							url: "/comments",
							data: {
								post: a,
								parent: t,
								content: this.formdata
							}
						}).then(function(t) {
							e.$Notice.success({
								title: "提交成功,请稍等"
							});
							var a = {
								id: t.data.id,
								name: t.data.author_name,
								avatar: t.data.avatar,
								content: t.data.content.rendered,
								zan: t.data.qinmei.zan,
								unzan: t.data.qinmei.unzan,
								report: t.data.qinmei.report,
								time: t.data.time
							};
							e.commentlist[s].children.push(a), e.formdata = "", e.loading = !1
						}).catch(function(t) {
							e.$Notice.error({
								title: "提交错误,请稍后重试"
							}), e.loading = !1
						}))
					},
					commenthide: function() {
						this.commentShow = -1, this.formdata = ""
					},
					commentshow: function(t) {
						this.commentShow = t, this.formdata = ""
					},
					childsubmit: function(t) {
						this.formdata = " 回复@" + t + ":"
					},
					updatameda: function(t) {
						this.imglist = t
					},
					imgview: function(t) {
						this.showimg = t, this.visible = !0
					},
					comment: function(t, s, a) {
						var e = this;
						if (!this.auth() && "login" == this.$store.state.user.status) {
							var n = JSON.parse(localStorage.token),
								i = o()(n).data.user.id;
							Object(r.a)({
								method: "post",
								url: "/update/comment",
								data: {
									id: t,
									user: i,
									meta: {
										type: s
									}
								}
							}).then(function(t) {
								e.commentlist[a].qinmei[s] = t.data
							}).catch(function(t) {
								e.$Notice.error({
									title: "产生错误,请稍后重试"
								})
							})
						}
					},
					childcomment: function(t, s, a) {
						var e = this;
						if (!this.auth() && "login" == this.$store.state.user.status) {
							var n = JSON.parse(localStorage.token),
								i = o()(n).data.user.id;
							Object(r.a)({
								method: "post",
								url: "/update/comment",
								data: {
									id: t,
									user: i,
									meta: {
										type: s
									}
								}
							}).then(function(t) {
								e.commentlist[e.commentShow].children[a][s] = t.data
							}).catch(function(t) {
								e.$Notice.error({
									title: "产生错误,请稍后重试"
								})
							})
						}
					}
				},
				mounted: function() {}
			}),
			y = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "comment-list"
					}, t._l(t.commentlist, function(s, e) {
						return a("div", {
							staticClass: "comment-list-parent"
						}, [a("div", {
							staticClass: "comment-avatar",
							style: {
								backgroundImage: "url(" + s.avatar + ")"
							}
						}), t._v(" "), a("div", {
							staticClass: "comment-main"
						}, [a("div", {
							staticClass: "comment-header"
						}, [a("p", [t._v(t._s(s.author))]), t._v(" "), a("Time", {
							attrs: {
								time: s.time
							}
						})], 1), t._v(" "), a("div", {
							staticClass: "comment-content"
						}, [t._v("\n      " + t._s(s.info) + "\n      ")]), t._v(" "), a("div", {
							staticClass: "comment-meta"
						}, t._l(s.qinmei.img, function(s) {
							return a("div", {
								staticClass: "comment-meta-con"
							}, ["" !== s ? a("div", {
								staticClass: "comment-meta-img",
								style: {
									backgroundImage: "url(" + s + ")"
								},
								attrs: {
									alt: ""
								},
								on: {
									click: function(a) {
										return t.imgview(s)
									}
								}
							}) : t._e()])
						}), 0), t._v(" "), a("div", {
							staticClass: "comment-footer"
						}, [a("div", {
							staticClass: "footer-button"
						}, [a("button", {
							staticClass: "zhihuBtn",
							class: t._f("usercontain")(s.qinmei.zan),
							on: {
								click: function(a) {
									return t.comment(s.id, "zan", e)
								}
							}
						}, [a("i", {
							staticClass: "iconfont icon-up"
						}), t._v(" "), a("span", [t._v("赞同 ")]), t._v(" "), s.qinmei.zan ? a("span", [t._v(t._s(s.qinmei.zan.length))]) : t._e()]), t._v(" "), a("button", {
							staticClass: "zhihuBtn",
							class: t._f("usercontain")(s.qinmei.unzan),
							on: {
								click: function(a) {
									return t.comment(s.id, "unzan", e)
								}
							}
						}, [a("i", {
							staticClass: "iconfont icon-down"
						}), t._v(" "), s.qinmei.unzan ? a("span", [t._v(t._s(s.qinmei.unzan.length))]) : t._e()])]), t._v(" "), a("div", {
							staticClass: "footer-icon"
						}, [s.children ? a("div", {
							staticClass: "footer-icon-list"
						}, [a("Icon", {
							attrs: {
								type: "ios-text",
								size: "20"
							}
						}), t._v(" "), t.commentShow == e ? a("span", {
							on: {
								click: t.commenthide
							}
						}, [t._v("收起评论")]) : a("span", {
							on: {
								click: function(s) {
									return t.commentshow(e)
								}
							}
						}, [s.children ? a("span", [t._v(t._s(s.children.length))]) : t._e(), t._v("\n              条评论")])], 1) : t._e(), t._v(" "), a("div", {
							staticClass: "footer-icon-list",
							class: t._f("usercontain")(s.qinmei.share),
							on: {
								click: function(a) {
									return t.comment(s.id, "share", e)
								}
							}
						}, [a("Icon", {
							attrs: {
								type: "md-cloudy",
								size: "20"
							}
						}), t._v(" "), a("span", [t._v("分享")])], 1), t._v(" "), a("div", {
							staticClass: "footer-icon-list",
							class: t._f("usercontain")(s.qinmei.like),
							on: {
								click: function(a) {
									return t.comment(s.id, "like", e)
								}
							}
						}, [a("Icon", {
							attrs: {
								type: "ios-heart",
								size: "20"
							}
						}), t._v(" "), a("span", [t._v("收藏")])], 1), t._v(" "), a("div", {
							staticClass: "footer-icon-list",
							class: t._f("usercontain")(s.qinmei.report),
							on: {
								click: function(a) {
									return t.comment(s.id, "report", e)
								}
							}
						}, [a("Icon", {
							attrs: {
								type: "md-notifications-off",
								size: "20"
							}
						}), t._v(" "), a("span", [t._v("举报")])], 1)])]), t._v(" "), s.children ? [t.commentShow == e ? a("div", {
							staticClass: "comment-children"
						}, [s.children ? a("div", {
							staticClass: "children-header"
						}, [a("span", [t._v(t._s(s.children.length) + " 条评论")])]) : t._e(), t._v(" "), t._l(s.children, function(e, n) {
							return a("div", {
								staticClass: "children-list"
							}, [a("div", {
								staticClass: "children-list-header"
							}, ["" != e.avatar ? a("Avatar", {
								attrs: {
									shape: "square",
									src: e.avatar,
									size: "small"
								}
							}) : a("Avatar", {
								attrs: {
									shape: "square",
									icon: "ios-person",
									size: "small"
								}
							}), t._v(" "), a("span", {
								staticClass: "children-list-auhtor"
							}, [t._v(t._s(e.name))]), t._v(" "), e.name == s.author_name ? a("span", {
								staticClass: "children-list-auhtor-confirm"
							}, [a("Tag", {
								attrs: {
									color: "warning"
								}
							}, [t._v("作者")])], 1) : t._e(), t._v(" "), a("Time", {
								staticClass: "child-comment-time",
								attrs: {
									time: e.time
								}
							})], 1), t._v(" "), a("div", {
								staticClass: "children-list-content"
							}, [t._v("\n              " + t._s(e.content) + "\n            ")]), t._v(" "), a("div", {
								staticClass: "children-list-footer"
							}, [a("div", {
								staticClass: "children-list-icon",
								class: t._f("usercontain")(e.zan),
								on: {
									click: function(s) {
										return t.childcomment(e.id, "zan", n)
									}
								}
							}, [a("Icon", {
								attrs: {
									type: "md-thumbs-up",
									size: "20"
								}
							}), t._v(" "), a("span", [t._v(t._s(e.zan.length))])], 1), t._v(" "), a("div", {
								staticClass: "children-list-icon children-hide",
								class: t._f("usercontain")(e.unzan),
								on: {
									click: function(s) {
										return t.childcomment(e.id, "unzan", n)
									}
								}
							}, [a("Icon", {
								attrs: {
									type: "md-thumbs-down",
									size: "20"
								}
							}), t._v(" "), a("span", [t._v(t._s(e.unzan.length))])], 1), t._v(" "), a("div", {
								staticClass: "children-list-icon children-hide",
								on: {
									click: function(s) {
										return t.childsubmit(e.name)
									}
								}
							}, [a("Icon", {
								attrs: {
									type: "ios-undo",
									size: "20"
								}
							}), t._v(" "), a("span", [t._v("回复")])], 1), t._v(" "), a("div", {
								staticClass: "children-list-icon children-hide",
								class: t._f("usercontain")(e.report),
								on: {
									click: function(s) {
										return t.childcomment(e.id, "report", n)
									}
								}
							}, [a("Icon", {
								attrs: {
									type: "md-notifications-off",
									size: "20"
								}
							}), t._v(" "), a("span", [t._v("举报")])], 1)])])
						}), t._v(" "), a("div", {
							staticClass: "children-footer"
						}, [a("Form", {
							ref: "formInline",
							refInFor: !0,
							staticClass: "comment-form",
							attrs: {
								inline: ""
							},
							nativeOn: {
								submit: function(t) {
									t.preventDefault()
								}
							}
						}, [a("Input", {
							attrs: {
								placeholder: "回复此动态"
							},
							model: {
								value: t.formdata,
								callback: function(s) {
									t.formdata = s
								},
								expression: "formdata"
							}
						}), t._v(" "), a("Button", {
							attrs: {
								type: "primary",
								loading: t.loading
							},
							on: {
								click: function(a) {
									return t.formsubmit(s.id, e, s.postid)
								}
							}
						}, [t.loading ? a("span", [t._v("提交中")]) : a("span", [t._v("回复")])])], 1)], 1)], 2) : t._e()] : t._e()], 2)])
					}), 0)
				},
				staticRenderFns: []
			};
		var w = a("VU/8")(C, y, !1, function(t) {
				a("xmsx")
			}, "data-v-60f20d71", null).exports,
			b = {
				components: {
					CommentList: w
				},
				data: function() {
					return {
						comment: 1,
						userdata: {
							comment: {
								write: [],
								zan: [],
								share: [],
								like: [],
								report: []
							}
						}
					}
				},
				filters: {
					poststatus: function(t) {
						switch (t) {
							case "pending":
								return "审核中";
							case "publish":
								return "已发布";
							default:
								return "被驳回"
						}
					}
				},
				methods: {
					getcomment: function(t) {
						var s = this;
						Object(r.a)({
							method: "post",
							url: "/userdata/comment",
							data: {
								type: t
							}
						}).then(function(a) {
							a.data && (s.userdata.comment[t] = a.data)
						}).catch(function(t) {
							console.log("连接错误")
						})
					},
					changeshow: function(t) {
						this.comment = t
					},
					goto: function(t) {
						this.$router.push({
							name: "post",
							params: {
								id: t
							}
						})
					}
				},
				mounted: function() {
					this.getcomment("write"), this.getcomment("zan"), this.getcomment("like"), this.getcomment("share"), this.getcomment("report")
				}
			},
			k = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "user-comment"
					}, [a("Menu", {
						attrs: {
							"active-name": "1",
							width: "160px"
						},
						on: {
							"on-select": t.changeshow
						}
					}, [a("MenuItem", {
						attrs: {
							name: "1"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-text"
						}
					}), t._v("\n            我的评论\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "2"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-thumbs-up"
						}
					}), t._v("\n            我的点赞\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "3"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-cloudy"
						}
					}), t._v("\n            我的分享\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "4"
						}
					}, [a("Icon", {
						attrs: {
							type: "ios-heart"
						}
					}), t._v("\n            我的收藏\n        ")], 1), t._v(" "), a("MenuItem", {
						attrs: {
							name: "5"
						}
					}, [a("Icon", {
						attrs: {
							type: "md-notifications-off"
						}
					}), t._v("\n            我的举报\n        ")], 1)], 1), t._v(" "), a("div", {
						staticClass: "panel-container"
					}, [a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 1 == t.comment,
							expression: "comment == 1"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.comment.write.length ? a("div", {
						staticClass: "panel-comment"
					}, [t._v("\n          暂无撰写记录\n        ")]) : a("div", {
						staticClass: "panel-comment"
					}, [a("CommentList", {
						attrs: {
							commentlist: t.userdata.comment.write
						}
					})], 1)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 2 == t.comment,
							expression: "comment == 2"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.comment.zan.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无点赞记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, [a("CommentList", {
						attrs: {
							commentlist: t.userdata.comment.zan
						}
					})], 1)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 3 == t.comment,
							expression: "comment == 3"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.comment.share.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无分享记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, [a("CommentList", {
						attrs: {
							commentlist: t.userdata.comment.share
						}
					})], 1)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 4 == t.comment,
							expression: "comment == 4"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.comment.like.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无收藏记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, [a("CommentList", {
						attrs: {
							commentlist: t.userdata.comment.like
						}
					})], 1)]), t._v(" "), a("div", {
						directives: [{
							name: "show",
							rawName: "v-show",
							value: 5 == t.comment,
							expression: "comment == 5"
						}],
						staticClass: "panel-children"
					}, [0 == t.userdata.comment.report.length ? a("div", {
						staticClass: "panel-longpost"
					}, [t._v("\n          暂无举报记录\n        ")]) : a("div", {
						staticClass: "panel-longpost"
					}, [a("CommentList", {
						attrs: {
							commentlist: t.userdata.comment.report
						}
					})], 1)])])], 1)
				},
				staticRenderFns: []
			};
		var I = a("VU/8")(b, k, !1, function(t) {
				a("U3pN")
			}, "data-v-5424df5a", null).exports,
			x = (l.a, {
				components: {
					Panel: l.a,
					Avatar: m,
					Longpost: p,
					Animateinfo: g,
					Comment: I
				},
				data: function() {
					return {
						panels: {
							show: 0,
							list: [{
								title: "动漫",
								slot: "panel1"
							}, {
								title: "长文",
								slot: "panel2"
							}, {
								title: "评论",
								slot: "panel3"
							}, {
								title: "资料编辑",
								slot: "panel4"
							}, {
								title: "会员等级",
								slot: "panel5"
							}, {
								title: "系统通知",
								slot: "panel6"
							}]
						},
						userform: {
							email: "",
							description: "",
							spinShow: !0
						},
						publicpost: []
					}
				},
				computed: {
					user: function() {
						return this.$store.state.user
					},
					sorcetransfer: function() {
						return this.$store.state.user.sorce % 100
					}
				},
				methods: {
					info: function(t) {
						this.$Notice.info({
							title: "提示",
							desc: t
						})
					},
					confirm: function() {
						var t = this;
						return this.userform.nickname.length < 4 ? (this.info("用户名需大于4个字符"), !1) : /站长|qinmei|管理员|楼主/.test(this.userform.nickname) ? (this.info("用户名包含禁止词汇,请重试"), !1) : void this.$Modal.confirm({
							title: "请确认是否修改用户资料?",
							content: "",
							onOk: function() {
								t.submit()
							},
							onCancel: function() {}
						})
					},
					submit: function() {
						this.userform.spinShow = !0;
						var t = {
							description: this.userform.description,
							email: this.userform.email
						};
						this.getinfo(t)
					},
					getinfo: function(t) {
						var s = this,
							a = o()(localStorage.token).data.user.id;
						Object(r.a)({
							method: "post",
							url: "/users/" + a,
							data: t
						}).then(function(t) {
							localStorage.user = n()(t.data), s.$store.commit("userupdate", t.data)
						}).catch(function(t) {
							console.log("链接错误")
						})
					},
					updatameda: function(t, s) {
						var a = {};
						"avatar" == s ? a = {
							qinmei: {
								vue_avatar: t
							}
						} : (s = "backimg") && (a = {
							qinmei: {
								vue_backimg: t
							}
						}), this.getinfo(a)
					},
					forminit: function() {
						this.userform.description = this.user.desc, this.userform.email = this.user.email, this.userform.spinShow = !1
					},
					logout: function() {
						localStorage.token = "", this.$router.go(0)
					},
					getpostlist: function() {
						var t = this,
							s = this.$store.state.posts[0].id;
						Object(r.a)({
							method: "get",
							url: "/posts?categories=" + s
						}).then(function(s) {
							s.data && (t.publicpost = s.data)
						}).catch(function(t) {
							console.log("链接错误")
						})
					},
					gotopost: function(t) {
						this.$router.push({
							name: "post",
							params: {
								id: t
							}
						})
					}
				},
				beforemounted: function() {
					"login" !== this.$store.state.user.status && this.$router.push({
						path: "/auth/login"
					})
				},
				mounted: function() {
					this.forminit(), this.getpostlist()
				}
			}),
			z = {
				render: function() {
					var t = this,
						s = t.$createElement,
						a = t._self._c || s;
					return a("div", {
						staticClass: "user container"
					}, [a("div", {
						staticClass: "head-bg",
						style: {
							backgroundImage: "url(" + t.user.bgimg + ")"
						}
					}, [a("div", {
						staticClass: "userinfo"
					}, [a("div", {
						staticClass: "user-avatar",
						style: {
							backgroundImage: "url(" + t.user.avatar + ")"
						}
					}), t._v(" "), a("div", {
						staticClass: "user-main"
					}, [a("div", [a("Tag", {
						attrs: {
							color: "default"
						}
					}, [t._v("Aid")]), t._v(": "), a("Tag", {
						attrs: {
							color: "#6a11cb"
						}
					}, [t._v(t._s(t.user.aid))])], 1), t._v(" "), a("div", [a("Tag", {
						attrs: {
							color: "default"
						}
					}, [t._v("Level")]), t._v(": "), a("Tag", {
						attrs: {
							color: "warning"
						}
					}, [t._v(t._s(t.user.level))])], 1), t._v(" "), a("div", [a("Tag", {
						attrs: {
							color: "default"
						}
					}, [t._v("用户名")]), t._v(": "), a("Tag", {
						attrs: {
							color: "primary"
						}
					}, [t._v(t._s(t.user.name))]), t._v(" "), a("Button", {
						attrs: {
							type: "error"
						},
						on: {
							click: t.logout
						}
					}, [t._v("退出登录")])], 1), t._v(" "), a("div", [a("Tag", {
						attrs: {
							color: "default"
						}
					}, [t._v("用户邮箱")]), t._v(": "), a("Tag", {
						attrs: {
							color: "success"
						}
					}, [t._v(t._s(t.user.email))])], 1)])])]), t._v(" "), a("Panel", {
						attrs: {
							panels: t.panels
						}
					}, [a("div", {
						staticClass: "panel-panel",
						attrs: {
							slot: "panel1"
						},
						slot: "panel1"
					}, [a("Animateinfo")], 1), t._v(" "), a("div", {
						attrs: {
							slot: "panel2"
						},
						slot: "panel2"
					}, [a("Longpost")], 1), t._v(" "), a("div", {
						attrs: {
							slot: "panel3"
						},
						slot: "panel3"
					}, [a("Comment")], 1), t._v(" "), a("div", {
						staticClass: "panel4",
						attrs: {
							slot: "panel4"
						},
						slot: "panel4"
					}, [a("Row", [a("Col", {
						staticClass: "spincontainer",
						attrs: {
							span: "12"
						}
					}, [a("Form", {
						attrs: {
							model: t.userform,
							"label-width": 80
						},
						nativeOn: {
							submit: function(t) {
								t.preventDefault()
							}
						}
					}, [a("FormItem", {
						attrs: {
							label: "用户名"
						}
					}, [a("Input", {
						attrs: {
							disabled: ""
						},
						model: {
							value: t.user.name,
							callback: function(s) {
								t.$set(t.user, "name", s)
							},
							expression: "user.name"
						}
					})], 1), t._v(" "), a("FormItem", {
						attrs: {
							label: "用户邮箱"
						}
					}, [a("Input", {
						model: {
							value: t.user.email,
							callback: function(s) {
								t.$set(t.user, "email", s)
							},
							expression: "user.email"
						}
					})], 1), t._v(" "), a("FormItem", {
						attrs: {
							label: "简介描述"
						}
					}, [a("Input", {
						attrs: {
							type: "textarea",
							autosize: {
								minRows: 4,
								maxRows: 5
							}
						},
						model: {
							value: t.userform.description,
							callback: function(s) {
								t.$set(t.userform, "description", s)
							},
							expression: "userform.description"
						}
					})], 1), t._v(" "), a("FormItem", [a("Button", {
						attrs: {
							type: "primary"
						},
						on: {
							click: t.confirm
						}
					}, [t._v("Submit")]), t._v(" "), a("Button", {
						staticStyle: {
							"margin-left": "8px"
						}
					}, [t._v("Cancel")])], 1)], 1), t._v(" "), t.userform.spinShow ? a("Spin", {
						attrs: {
							size: "large",
							fix: ""
						}
					}) : t._e()], 1), t._v(" "), a("Col", {
						staticClass: "user-set-info",
						attrs: {
							span: "12"
						}
					}, [a("Row", {
						staticClass: "code-row-bg",
						attrs: {
							type: "flex",
							justify: "space-between",
							align: "middle"
						}
					}, [a("Col", {
						staticClass: "text-right",
						attrs: {
							span: "4"
						}
					}, [t._v("设置头像")]), t._v(" "), a("Col", {
						attrs: {
							span: "18"
						}
					}, [a("Avatar", {
						attrs: {
							avatar: t.user.avatar,
							avatarWidth: 3
						},
						on: {
							updatameda: t.updatameda
						}
					})], 1)], 1), t._v(" "), a("Row", {
						staticClass: "code-row-bg",
						attrs: {
							type: "flex",
							justify: "space-between",
							align: "middle"
						}
					}, [a("Col", {
						staticClass: "text-right",
						attrs: {
							span: "4"
						}
					}, [t._v("设置背景图")]), t._v(" "), a("Col", {
						attrs: {
							span: "18"
						}
					}, [a("Avatar", {
						attrs: {
							avatar: t.user.bgimg,
							avatarWidth: 15
						},
						on: {
							updatameda: t.updatameda
						}
					})], 1)], 1)], 1)], 1)], 1), t._v(" "), a("div", {
						attrs: {
							slot: "panel5"
						},
						slot: "panel5"
					}, [a("div", {
						staticClass: "user-member"
					}, [a("div", {
						staticClass: "user-sorce-percent"
					}, [a("Progress", {
						attrs: {
							percent: t.sorcetransfer,
							status: "active"
						}
					})], 1), t._v(" "), a("div", {
						staticClass: "user-sorce-con"
					}, [a("div", {
						staticClass: "user-sorce"
					}, [t._v("\n              积分:\n              "), a("Tag", {
						attrs: {
							color: "primary"
						}
					}, [t._v(t._s(t.user.sorce))])], 1), t._v(" "), a("div", {
						staticClass: "user-level"
					}, [t._v("\n              等级:\n              "), a("Tag", {
						attrs: {
							color: "primary"
						}
					}, [t._v(t._s(t.user.level))])], 1)])]), t._v(" "), a("div", {
						staticClass: "user-member-explain"
					}, [a("p", [t._v("1. 用户积分可通过评论等等获取;")]), t._v(" "), a("p", [t._v("2. 请遵守相关规则,否则积分可做无效处理;")])])]), t._v(" "), a("div", {
						attrs: {
							slot: "panel6"
						},
						slot: "panel6"
					}, [a("div", {
						staticClass: "public-post"
					}, t._l(t.publicpost, function(s) {
						return a("div", {
							staticClass: "post-list",
							on: {
								click: function(a) {
									return t.gotopost(s.id)
								}
							}
						}, [a("div", {
							staticClass: "post-list-title"
						}, [a("span", [t._v(t._s(s.animate))]), t._v("\n                  " + t._s(s.title.rendered) + "\n                ")]), t._v(" "), a("Time", {
							attrs: {
								time: s.date_gmt
							}
						})], 1)
					}), 0)])])], 1)
				},
				staticRenderFns: []
			};
		var $ = a("VU/8")(x, z, !1, function(t) {
			a("fIzw")
		}, "data-v-6ca25ac5", null);
		s.default = $.exports
	},
	xmsx: function(t, s) {}
});