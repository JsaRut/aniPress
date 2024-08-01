webpackJsonp([8], {
	Y6A4: function(t, e, i) {
		"use strict";
		Object.defineProperty(e, "__esModule", {
			value: !0
		});
		var s = i("BSc5"),
			n = i("RsmR"),
			a = (i("cJ47"), {
				data: function() {
					return {
						show: 0,
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
						}]
					}
				},
				props: ["panels"],
				computed: {
					listColor: function() {
						return function(t) {
							var e = t.split("T")[0].split("-"),
								i = new Date;
							i.setFullYear(e[0]), i.setMonth(e[1] - 1), i.setDate(e[2]);
							var s = new Date,
								n = s.getDay();
							if ("0" == n && (n = 7), s.setHours(0), s.setMinutes(0), s.setSeconds(0), i > s - 3600 * (n - 1) * 24 * 1e3) return "#f25d8e"
						}
					},
					newList: function() {
						var t = this,
							e = [];
						return this.new.map(function(i) {
							e.push({
								title: i.title,
								list: t.$store.state.animate.time[i.link]
							})
						}), e
					},
					newlist: function() {
						var t = this.newList;
						(new Date).getDay();
						return t = t.concat(t), t = t.splice(this.show, 7), t
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
			}),
			l = {
				render: function() {
					var t = this,
						e = t.$createElement,
						i = t._self._c || e;
					return i("div", {
						staticClass: "newlist"
					}, [0 == t.newlist.length ? i("Spin", {
						attrs: {
							fix: ""
						}
					}, [i("Icon", {
						staticClass: "demo-spin-icon-load",
						attrs: {
							type: "ios-loading",
							size: "18"
						}
					}), t._v(" "), i("div", [t._v("Loading")])], 1) : i("div", {
						staticClass: "newlist-con"
					}, t._l(t.newlist, function(e, s) {
						return i("div", {
							staticClass: "newlist-list"
						}, [i("div", {
							staticClass: "list-left",
							class: 0 == s ? "active" : ""
						}, [i("span"), t._v(t._s(e.title))]), t._v(" "), i("div", {
							staticClass: "list-right"
						}, t._l(e.list, function(e) {
							return i("div", {
								staticClass: "panel-list",
								on: {
									click: function(i) {
										return t.goTo(e.slug)
									}
								}
							}, [i("div", {
								staticClass: "panel-list-img",
								style: {
									backgroundImage: "url(" + e.baseinfo_img_link + ")"
								}
							}), t._v(" "), i("div", {
								staticClass: "panel-list-title"
							}, [t._v(t._s(e.title.rendered))]), t._v(" "), i("div", {
								staticClass: "list-num",
								style: {
									backgroundColor: t.listColor(e.modified)
								},
								attrs: {
									time: e.modified
								}
							}, [i("span", [t._v(t._s(Object.keys(e.baseinfo_episode_con).length))])])])
						}), 0)])
					}), 0)], 1)
				},
				staticRenderFns: []
			};
		var o = i("VU/8")(a, l, !1, function(t) {
				i("a6EM")
			}, null, null).exports,
			r = i("3U9L"),
			c = (s.a, n.a, r.a, {
				components: {
					Headimg: s.a,
					Panel: n.a,
					Newlist: o,
					Timeline: r.a
				},
				data: function() {
					return {
						panels: {
							show: 0,
							list: [{
								title: "新番连载",
								slot: "panel1"
							}, {
								title: "最近上架",
								slot: "panel2"
							}]
						}
					}
				},
				computed: {
					showlist: function() {
						return this.$store.state.animate.time.all
					},
					headimg: function() {
						return {
							img: this.$store.state.config.img.new,
							title: "新番上架"
						}
					}
				}
			}),
			d = {
				render: function() {
					var t = this.$createElement,
						e = this._self._c || t;
					return e("div", {
						staticClass: "container"
					}, [e("Headimg", {
						attrs: {
							headimg: this.headimg
						}
					}), this._v(" "), e("Panel", {
						attrs: {
							panels: this.panels
						}
					}, [e("Newlist", {
						attrs: {
							slot: "panel1"
						},
						slot: "panel1"
					}), this._v(" "), e("Timeline", {
						attrs: {
							slot: "panel2",
							panels: this.showlist
						},
						slot: "panel2"
					})], 1)], 1)
				},
				staticRenderFns: []
			};
		var u = i("VU/8")(c, d, !1, function(t) {
			i("xomk")
		}, "data-v-49835d90", null);
		e.default = u.exports
	},
	a6EM: function(t, e) {},
	xomk: function(t, e) {}
});