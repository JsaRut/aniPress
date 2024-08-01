webpackJsonp([9], {
	jG64: function(t, e) {},
	uEKL: function(t, e, a) {
		"use strict";
		Object.defineProperty(e, "__esModule", {
			value: !0
		});
		var n = a("BSc5"),
			s = a("RsmR"),
			i = a("zvuU"),
			l = a("3U9L"),
			o = a("vqPL"),
			r = (n.a, s.a, i.a, l.a, o.a, {
				components: {
					Headimg: n.a,
					Panel: s.a,
					Showlist: i.a,
					Timeline: l.a,
					Rateline: o.a
				},
				data: function() {
					return {
						navigation: {
							total: 0,
							size: 30,
							current: 1
						},
						panels: {
							show: 0,
							list: [{
								title: "全部番剧",
								slot: "panel1"
							}, {
								title: "最近上架",
								slot: "panel2"
							}, {
								title: "评分排行",
								slot: "panel3"
							}]
						},
						cattotal: {
							recommend: "好评推荐",
							fun: "搞笑轻松",
							fight: "战斗热血",
							daily: "日常卖萌",
							cure: "治愈感动",
							depress: "致郁惊悚",
							world: "异界幻想"
						}
					}
				},
				computed: {
					rateslug: function() {
						return this.$route.params.cat
					},
					showlist: function() {
						return this.$store.state.animate.time[this.rateslug]
					},
					pagetotal: function() {
						return this.$store.state.animate.total[this.rateslug]
					},
					headimg: function() {
						return {
							img: this.$store.state.config.img[this.rateslug],
							title: this.cattotal[this.rateslug]
						}
					}
				},
				methods: {
					pageChange: function(t) {
						this.navigation.current = t, this.$store.dispatch("updatepagecat", {
							type: this.rateslug,
							current: t
						}), window.scroll(0, 0)
					}
				},
				beforeRouteUpdate: function(t, e, a) {
					this.navigation.current = 1, a()
				}
			}),
			u = {
				render: function() {
					var t = this,
						e = t.$createElement,
						a = t._self._c || e;
					return a("div", {
						staticClass: "container"
					}, [a("Headimg", {
						attrs: {
							headimg: t.headimg
						}
					}), t._v(" "), a("Panel", {
						attrs: {
							panels: t.panels
						}
					}, [a("Showlist", {
						attrs: {
							slot: "panel1",
							panels: t.showlist
						},
						slot: "panel1"
					}, [a("div", {
						staticClass: "navigation"
					}, [a("Page", {
						attrs: {
							total: t.pagetotal,
							current: t.navigation.current,
							"page-size": t.navigation.size,
							"show-elevator": ""
						},
						on: {
							"on-change": t.pageChange
						}
					})], 1)]), t._v(" "), a("Timeline", {
						attrs: {
							slot: "panel2",
							panels: t.showlist
						},
						slot: "panel2"
					}), t._v(" "), a("Rateline", {
						attrs: {
							slot: "panel3",
							panels: t.rateslug
						},
						slot: "panel3"
					})], 1)], 1)
				},
				staticRenderFns: []
			};
		var c = a("VU/8")(r, u, !1, function(t) {
			a("jG64")
		}, "data-v-e01b7be6", null);
		e.default = c.exports
	}
});