webpackJsonp([16], {
	"aLn+": function(t, e) {},
	we1U: function(t, e, a) {
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
						}
					}
				},
				computed: {
					rateslug: function() {
						return "recommend"
					},
					showlist: function() {
						return this.$store.state.animate.time.recommend
					},
					pagetotal: function() {
						return this.$store.state.animate.total.recommend
					},
					headimg: function() {
						return {
							img: this.$store.state.config.img.recommend,
							title: "站长推荐"
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
				}
			}),
			c = {
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
		var u = a("VU/8")(r, c, !1, function(t) {
			a("aLn+")
		}, "data-v-7a37f6f6", null);
		e.default = u.exports
	}
});