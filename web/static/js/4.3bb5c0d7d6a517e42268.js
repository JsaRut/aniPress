webpackJsonp([4], {
	"8Usj": function(t, i) {},
	"8hXn": function(t, i, n) {
		"use strict";
		Object.defineProperty(i, "__esModule", {
			value: !0
		});
		n("cJ47");
		var e = {
				data: function() {
					return {
						currentIndex: 0
					}
				},
				methods: {
					stopTimer: function() {
						clearInterval(this.timer)
					},
					goTo: function(t) {
						this.$router.push({
							name: "animate",
							params: {
								id: t
							}
						})
					},
					setTimer: function() {
						var t = this;
						this.timer = setInterval(function() {
							t.currentIndex < t.scroll.length - 1 ? t.currentIndex++ : t.currentIndex = 0
						}, 5e3)
					}
				},
				computed: {
					scroll: function() {
						return this.$store.state.animate.time.scroll.slice(0, 5)
					}
				},
				mounted: function() {
					this.setTimer()
				},
				beforeDestory: function() {
					this.timer && clearInterval(this.timer)
				}
			},
			s = {
				render: function() {
					var t = this,
						i = t.$createElement,
						n = t._self._c || i;
					return n("div", {
						staticClass: "scroll",
						on: {
							mouseover: t.stopTimer,
							mouseout: t.setTimer
						}
					}, [t._l(t.scroll, function(i, e) {
						return n("div", {
							directives: [{
								name: "show",
								rawName: "v-show",
								value: e == t.currentIndex,
								expression: "index == currentIndex "
							}],
							key: i.id,
							staticClass: "imglist",
							style: {
								backgroundImage: "url(" + i.baseinfo_simg_link + ")"
							},
							attrs: {
								alt: ""
							},
							on: {
								click: function(n) {
									return t.goTo(i.slug)
								}
							}
						})
					}), t._v(" "), n("div", {
						staticClass: "scroll-dot"
					}, t._l(t.scroll, function(i, e) {
						return n("span", {
							key: i.id,
							class: [e == t.currentIndex ? "active" : ""],
							on: {
								mouseover: function(i) {
									t.currentIndex = e
								}
							}
						})
					}), 0)], 2)
				},
				staticRenderFns: []
			};
		var a = n("VU/8")(e, s, !1, function(t) {
				n("Ms3V")
			}, "data-v-f8611390", null).exports,
			l = {
				render: function() {
					var t = this,
						i = t.$createElement,
						n = t._self._c || i;
					return n("div", {
						staticClass: "top"
					}, t._l(t.topList, function(i, e) {
						return n("div", {
							key: e,
							staticClass: "main-list",
							style: {
								backgroundImage: "url(" + i.baseinfo_simg_link + ")"
							},
							on: {
								click: function(n) {
									return t.goTo(i.slug)
								}
							}
						}, [n("span", [t._v(t._s(i.title.rendered))])])
					}), 0)
				},
				staticRenderFns: []
			};
		var o = n("VU/8")({
				data: function() {
					return {}
				},
				computed: {
					topList: function() {
						return this.$store.state.animate.time.top.slice(0, 6)
					}
				},
				methods: {
					goTo: function(t) {
						this.$router.push({
							name: "animate",
							params: {
								id: t
							}
						})
					}
				}
			}, l, !1, function(t) {
				n("8Usj")
			}, "data-v-86c9cbf0", null).exports,
			r = {
				data: function() {
					return {
						new: [{
							title: "周日",
							link: "day7"
						}, {
							title: "周一",
							link: "day1"
						}, {
							title: "周二",
							link: "day2"
						}, {
							title: "周三",
							link: "day3"
						}, {
							title: "周四",
							link: "day4"
						}, {
							title: "周五",
							link: "day5"
						}, {
							title: "周六",
							link: "day6"
						}],
						newShow: 0
					}
				},
				computed: {
					newList: function() {
						var t = this,
							i = [];
						return this.new.map(function(n) {
							i.push({
								title: n.title,
								list: t.$store.state.animate.time[n.link]
							})
						}), i
					},
					listColor: function() {
						return function(t) {
							var i = t.split("T")[0].split("-"),
								n = new Date;
							n.setFullYear(i[0]), n.setMonth(i[1] - 1), n.setDate(i[2]);
							var e = new Date,
								s = e.getDay();
							if ("0" == s && (s = 7), e.setHours(0), e.setMinutes(0), e.setSeconds(0), n > e - 3600 * (s - 1) * 24 * 1e3) return "#f25d8e"
						}
					}
				},
				methods: {
					tabnum: function(t) {
						this.newShow = t
					},
					goTo: function(t) {
						this.$router.push({
							name: "animate",
							params: {
								id: t
							}
						})
					},
					initData: function() {
						var t = (new Date).getDay();
						this.newShow = t
					}
				},
				mounted: function() {
					this.initData()
				}
			},
			c = {
				render: function() {
					var t = this,
						i = t.$createElement,
						n = t._self._c || i;
					return n("div", {
						staticClass: "new-panel"
					}, [n("div", {
						staticClass: "panel-title"
					}, [t._m(0), t._v(" "), n("div", {
						staticClass: "title-tab"
					}, t._l(t.newList, function(i, e) {
						return n("span", {
							key: i.title,
							staticClass: "new-list",
							class: {
								active: e === t.newShow
							},
							on: {
								click: function(i) {
									return t.tabnum(e)
								}
							}
						}, [t._v("\n      " + t._s(i.title) + "\n      "), n("span", {
							directives: [{
								name: "show",
								rawName: "v-show",
								value: e === t.newShow,
								expression: "index === newShow"
							}],
							staticClass: "bottom-trangle"
						})])
					}), 0)]), t._v(" "), n("div", {
						staticClass: "panels"
					}, t._l(t.newList, function(i, e) {
						return n("div", {
							directives: [{
								name: "show",
								rawName: "v-show",
								value: e == t.newShow,
								expression: "index == newShow"
							}],
							key: i.title,
							staticClass: "panel"
						}, t._l(i.list, function(i) {
							return n("div", {
								key: i.id,
								staticClass: "panel-list",
								on: {
									click: function(n) {
										return t.goTo(i.slug)
									}
								}
							}, [n("div", {
								staticClass: "panel-list-img",
								style: {
									backgroundImage: "url(" + i.baseinfo_img_link + ")"
								}
							}), t._v(" "), n("div", {
								staticClass: "panel-list-title"
							}, [t._v(t._s(i.title.rendered))]), t._v(" "), n("div", {
								staticClass: "list-num",
								style: {
									backgroundColor: t.listColor(i.modified)
								},
								attrs: {
									time: i.modified
								}
							}, [n("span", [t._v(t._s(Object.keys(i.baseinfo_episode_con).length))])])])
						}), 0)
					}), 0)])
				},
				staticRenderFns: [function() {
					var t = this.$createElement,
						i = this._self._c || t;
					return i("div", {
						staticClass: "title-main"
					}, [i("i", {
						staticClass: "iconfont icon-xinpin"
					}), this._v("\n      新番连载\n    ")])
				}]
			};
		var u = n("VU/8")(r, c, !1, function(t) {
				n("m+2h")
			}, "data-v-5467efac", null).exports,
			d = {
				render: function() {
					var t = this,
						i = t.$createElement,
						n = t._self._c || i;
					return n("div", {
						staticClass: "module-con"
					}, [n("div", {
						staticClass: "modules"
					}, [n("div", {
						staticClass: "module-title"
					}, [n("div", {
						staticClass: "title-main"
					}, [n("i", {
						staticClass: "iconfont",
						class: t.module.class
					}), t._v("\n        " + t._s(t.module.title) + " \n      ")]), t._v(" "), n("div", {
						staticClass: "title-btn",
						on: {
							click: function(i) {
								return t.gotokind(t.module.link)
							}
						}
					}, [t._v("\n          查看更多\n      ")])]), t._v(" "), n("div", {
						staticClass: "module-panel"
					}, [t.listall ? n("div", {
						staticClass: "panel-container-no"
					}, t._l(t.listall, function(i) {
						return n("div", {
							key: i.id,
							staticClass: "panel-list",
							on: {
								click: function(n) {
									return t.goTo(i.slug)
								}
							}
						}, [n("div", {
							staticClass: "panel-list-img",
							style: {
								backgroundImage: "url(" + i.baseinfo_img_link + ")"
							}
						}), t._v(" "), n("div", {
							staticClass: "panel-list-title"
						}, [t._v(t._s(i.title.rendered))])])
					}), 0) : n("Spin", {
						attrs: {
							fix: ""
						}
					}, [n("Icon", {
						staticClass: "demo-spin-icon-load",
						attrs: {
							type: "ios-loading",
							size: "18"
						}
					}), t._v(" "), n("div", [t._v("Loading")])], 1)], 1)])])
				},
				staticRenderFns: []
			};
		var m = n("VU/8")({
				props: ["module"],
				data: function() {
					return {}
				},
				computed: {
					listall: function() {
						return this.$store.state.animate.time[this.module.link].slice(0, 12)
					}
				},
				methods: {
					goTo: function(t) {
						this.$router.push({
							name: "animate",
							params: {
								id: t
							}
						})
					},
					gotokind: function(t) {
						"recommend" == t ? this.$router.push({
							path: "/recommend"
						}) : this.$router.push({
							path: "/animatekind/" + t
						})
					}
				}
			}, d, !1, function(t) {
				n("FXkI")
			}, null, null).exports,
			v = {
				components: {
					Scroll: a,
					Top: o,
					New: u,
					Module: m
				},
				data: function() {
					return {
						indexmodules: [{
							title: "好评推荐",
							link: "recommend",
							class: "icon-ic_movie_filter"
						}, {
							title: "搞笑轻松",
							link: "fun",
							class: "icon-kafeibei"
						}, {
							title: "战斗热血",
							link: "fight",
							class: "icon-zhandouzuozhan"
						}, {
							title: "日常卖萌",
							link: "daily",
							class: "icon-youxian"
						}, {
							title: "治愈感动",
							link: "cure",
							class: "icon-kongdiao"
						}, {
							title: "致郁惊悚",
							link: "depress",
							class: "icon-yule"
						}, {
							title: "异界幻想",
							link: "world",
							class: "icon-mudedi"
						}]
					}
				},
				computed: {
					newList: function() {
						return this.$store.state.newList
					},
					config: function() {
						return this.$store.state.config
					}
				}
			},
			f = {
				render: function() {
					var t = this,
						i = t.$createElement,
						n = t._self._c || i;
					return n("div", {
						staticClass: "main"
					}, [n("div", {
						staticClass: "main-top",
						style: {
							backgroundImage: "url(" + t.config.img.index + ")"
						}
					}, [n("div", {
						staticClass: "main-text"
					}, [n("div", {
						staticClass: "main-name"
					}, [t._v(t._s(t.config.name))]), t._v(" "), n("div", {
						staticClass: "main-slogan"
					}, [t._v(t._s(t.config.slogan))])])]), t._v(" "), n("div", {
						staticClass: "container"
					}, [n("div", {
						staticClass: "main-sec"
					}, [n("div", {
						staticClass: "scroll-con"
					}, [n("Scroll")], 1), t._v(" "), n("div", {
						staticClass: "top-right"
					}, [n("Top")], 1)]), t._v(" "), n("div", {
						staticClass: "section"
					}, [n("New", {
						attrs: {
							newList: t.newList
						}
					})], 1), t._v(" "), t._l(t.indexmodules, function(t) {
						return n("div", {
							key: t.link,
							staticClass: "section"
						}, [n("Module", {
							attrs: {
								module: t
							}
						})], 1)
					})], 2)])
				},
				staticRenderFns: []
			};
		var h = n("VU/8")(v, f, !1, function(t) {
			n("Vjw6")
		}, "data-v-30e74a78", null);
		i.default = h.exports
	},
	FXkI: function(t, i) {},
	Ms3V: function(t, i) {},
	Vjw6: function(t, i) {},
	"m+2h": function(t, i) {}
});