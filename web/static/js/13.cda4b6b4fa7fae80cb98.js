webpackJsonp([13], {
	"2QH8": function(t, a, e) {
		"use strict";
		Object.defineProperty(a, "__esModule", {
			value: !0
		});
		var n = e("cJ47"),
			i = e("BSc5"),
			s = e("RsmR"),
			o = e("zvuU"),
			r = (i.a, s.a, o.a, {
				components: {
					Headimg: i.a,
					Panel: s.a,
					Showlist: o.a
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
								title: "",
								slot: "panel1"
							}]
						},
						showlist: []
					}
				},
				computed: {
					searchword: function() {
						return this.$route.query.s
					},
					headimg: function() {
						return {
							img: this.$store.state.config.img.search,
							title: "搜索结果"
						}
					}
				},
				watch: {
					searchword: function() {
						this.initData()
					}
				},
				methods: {
					initData: function() {
						var t = this;
						this.panels.list[0].title = this.$route.query.s, Object(n.a)({
							method: "get",
							url: "/animate",
							params: {
								search: this.$route.query.s,
								per_page: 30,
								page: this.navigation.current
							}
						}).then(function(a) {
							a.data && (t.showlist = a.data, t.navigation.total = parseInt(a.headers["x-wp-total"]), 0 === a.data.length && t.$Notice.error({
								title: "搜索暂无结果"
							}))
						}).catch(function(a) {
							t.$Notice.error({
								title: "加载超时,请刷新重试"
							})
						})
					},
					pageChange: function(t) {
						this.navigation.current = t, this.initData(), window.scroll(0, 0)
					}
				},
				mounted: function() {
					this.initData()
				}
			}),
			c = {
				render: function() {
					var t = this,
						a = t.$createElement,
						e = t._self._c || a;
					return e("div", {
						staticClass: "container"
					}, [e("Headimg", {
						attrs: {
							headimg: t.headimg
						}
					}), t._v(" "), e("Panel", {
						attrs: {
							panels: t.panels
						}
					}, [e("Showlist", {
						attrs: {
							slot: "panel1",
							panels: t.showlist
						},
						slot: "panel1"
					}, [e("div", {
						staticClass: "navigation"
					}, [e("Page", {
						attrs: {
							total: t.navigation.total,
							current: t.navigation.current,
							"page-size": t.navigation.size,
							"show-elevator": ""
						},
						on: {
							"on-change": t.pageChange
						}
					})], 1)])], 1)], 1)
				},
				staticRenderFns: []
			};
		var l = e("VU/8")(r, c, !1, function(t) {
			e("5K9I")
		}, "data-v-b36dd484", null);
		a.default = l.exports
	},
	"5K9I": function(t, a) {}
});