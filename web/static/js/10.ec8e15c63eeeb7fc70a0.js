webpackJsonp([10], {
	"6Htx": function(a, t, n) {
		"use strict";
		Object.defineProperty(t, "__esModule", {
			value: !0
		});
		var i = n("cJ47"),
			e = n("BSc5"),
			s = n("RsmR"),
			o = n("zvuU"),
			r = n("3U9L"),
			l = n("vqPL"),
			m = (e.a, s.a, o.a, r.a, l.a, {
				components: {
					Headimg: e.a,
					Panel: s.a,
					Showlist: o.a,
					Timeline: r.a,
					Rateline: l.a
				},
				data: function() {
					return {
						showlist: [],
						navigation: {
							total: 0,
							size: 30,
							current: 1
						},
						rateslug: "all",
						taxonomy: {
							area: [{
								name: "日本",
								id: "7"
							}],
							year: [],
							tag: []
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
						params: {
							animatearea: 0,
							animateyear: 0,
							animatetag: 0
						}
					}
				},
				computed: {
					headimg: function() {
						return {
							img: this.$store.state.config.img.all,
							title: "所有番剧"
						}
					}
				},
				methods: {
					initData: function() {
						var a = this,
							t = {};
						["animatearea", "animateyear", "animatetag"].map(function(n) {
							0 !== a.params[n] && (t[n] = a.params[n])
						}), Object(i.a)({
							method: "get",
							url: "/animate?per_page=30&page=" + this.navigation.current,
							params: t
						}).then(function(t) {
							a.showlist = t.data, a.navigation.total = parseInt(t.headers["x-wp-total"])
						})
					},
					pageChange: function(a) {
						this.navigation.current = a, this.showlist = this.initData(), window.scroll(0, 0)
					},
					initTaxonomy: function(a) {
						var t = this;
						Object(i.a)({
							method: "get",
							url: "/animate" + a,
							params: {
								orderby: "count",
								order: "desc",
								per_page: 30
							}
						}).then(function(n) {
							t.taxonomy[a] = n.data
						})
					},
					addparams: function(a, t) {
						this.params[a] == t ? this.params[a] = 0 : this.params[a] = t, this.showlist = this.initData()
					}
				},
				mounted: function() {
					this.initData(), this.initTaxonomy("area"), this.initTaxonomy("year"), this.initTaxonomy("tag")
				}
			}),
			c = {
				render: function() {
					var a = this,
						t = a.$createElement,
						n = a._self._c || t;
					return n("div", {
						staticClass: "container"
					}, [n("Headimg", {
						attrs: {
							headimg: a.headimg
						}
					}), a._v(" "), n("div", {
						staticClass: "aniamte-filter"
					}, [n("div", {
						staticClass: "animate-taxonomy"
					}, [a._m(0), a._v(" "), n("div", {
						staticClass: "taxonomy-list"
					}, a._l(a.taxonomy.area, function(t) {
						return n("span", {
							staticClass: "taxonomy-single",
							class: a.params.animatearea == t.id ? "active" : "",
							on: {
								click: function(n) {
									return a.addparams("animatearea", t.id)
								}
							}
						}, [a._v(a._s(t.name))])
					}), 0)]), a._v(" "), n("div", {
						staticClass: "animate-taxonomy"
					}, [a._m(1), a._v(" "), n("div", {
						staticClass: "taxonomy-list"
					}, a._l(a.taxonomy.year, function(t) {
						return n("span", {
							staticClass: "taxonomy-single",
							class: a.params.animateyear == t.id ? "active" : "",
							on: {
								click: function(n) {
									return a.addparams("animateyear", t.id)
								}
							}
						}, [a._v(a._s(t.name))])
					}), 0)]), a._v(" "), n("div", {
						staticClass: "animate-taxonomy"
					}, [a._m(2), a._v(" "), n("div", {
						staticClass: "taxonomy-list"
					}, a._l(a.taxonomy.tag, function(t) {
						return n("span", {
							staticClass: "taxonomy-single",
							class: a.params.animatetag == t.id ? "active" : "",
							on: {
								click: function(n) {
									return a.addparams("animatetag", t.id)
								}
							}
						}, [a._v(a._s(t.name))])
					}), 0)])]), a._v(" "), n("Panel", {
						attrs: {
							panels: a.panels
						}
					}, [n("Showlist", {
						attrs: {
							slot: "panel1",
							panels: a.showlist
						},
						slot: "panel1"
					}, [n("div", {
						staticClass: "navigation"
					}, [n("Page", {
						attrs: {
							total: a.navigation.total,
							current: a.navigation.current,
							"page-size": a.navigation.size,
							"show-elevator": ""
						},
						on: {
							"on-change": a.pageChange
						}
					})], 1)]), a._v(" "), n("Timeline", {
						attrs: {
							slot: "panel2",
							panels: a.showlist
						},
						slot: "panel2"
					}), a._v(" "), n("Rateline", {
						attrs: {
							slot: "panel3",
							panels: a.rateslug
						},
						slot: "panel3"
					})], 1)], 1)
				},
				staticRenderFns: [function() {
					var a = this.$createElement,
						t = this._self._c || a;
					return t("div", {
						staticClass: "taxonomy-header"
					}, [t("span", [this._v("地区:")])])
				}, function() {
					var a = this.$createElement,
						t = this._self._c || a;
					return t("div", {
						staticClass: "taxonomy-header"
					}, [t("span", [this._v("年份:")])])
				}, function() {
					var a = this.$createElement,
						t = this._self._c || a;
					return t("div", {
						staticClass: "taxonomy-header"
					}, [t("span", [this._v("标签:")])])
				}]
			};
		var d = n("VU/8")(m, c, !1, function(a) {
			n("CYAe")
		}, "data-v-d0ccb1b4", null);
		t.default = d.exports
	},
	CYAe: function(a, t) {}
});