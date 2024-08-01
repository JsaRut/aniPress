webpackJsonp([6], {
	"G/OK": function(t, s) {},
	cOqS: function(t, s, e) {
		"use strict";
		Object.defineProperty(s, "__esModule", {
			value: !0
		});
		var i = e("cJ47"),
			n = e("BSc5"),
			a = {
				props: {
					panels: {
						default: 0
					}
				},
				data: function() {
					return {
						showlist: []
					}
				},
				filters: {
					removehtml: function(t) {
						return t.replace(/<[^>]+>/g, "")
					}
				},
				methods: {
					initData: function(t) {
						var s = this;
						Object(i.a)({
							method: "get",
							url: "/posts?categories=" + t
						}).then(function(t) {
							s.showlist = t.data
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
				mounted: function() {
					this.initData(this.panels.cat)
				}
			},
			o = {
				render: function() {
					var t = this,
						s = t.$createElement,
						e = t._self._c || s;
					return e("div", {
						staticClass: "postlist"
					}, t._l(t.showlist, function(s) {
						return e("div", {
							staticClass: "post-list",
							on: {
								click: function(e) {
									return t.gotopost(s.id)
								}
							}
						}, [e("div", {
							staticClass: "list-img",
							style: {
								backgroundImage: "url(" + s.headimg + ")"
							}
						}, [e("div", {
							staticClass: "list-title"
						}, [t._v(t._s(s.title.rendered))])]), t._v(" "), e("div", {
							staticClass: "list-text"
						}, [t._v("\n      " + t._s(t._f("removehtml")(s.user.smalldes)) + "\n    ")]), t._v(" "), e("div", {
							staticClass: "post-view"
						}, [e("span", [e("Icon", {
							attrs: {
								type: "ios-text"
							}
						}), t._v("\n        " + t._s(s.comment) + "\n      ")], 1), t._v(" "), e("span", [e("Icon", {
							attrs: {
								type: "md-eye"
							}
						}), t._v("\n        " + t._s(s.view) + "\n      ")], 1)])])
					}), 0)
				},
				staticRenderFns: []
			};
		var r = e("VU/8")(a, o, !1, function(t) {
				e("G/OK")
			}, "data-v-c7e613d8", null).exports,
			l = (n.a, {
				components: {
					Headimg: n.a,
					Postlist: r
				},
				data: function() {
					return {
						indexshow: 0
					}
				},
				computed: {
					headimg: function() {
						return {
							img: this.$store.state.config.img.topic,
							title: "专题图文"
						}
					},
					postlist: function() {
						return this.$store.state.config.post.sort(function(t, s) {
							return t.slug.localeCompare(s.slug)
						})
					}
				},
				methods: {}
			}),
			c = {
				render: function() {
					var t = this,
						s = t.$createElement,
						e = t._self._c || s;
					return e("div", {
						staticClass: "container"
					}, [e("Headimg", {
						attrs: {
							headimg: t.headimg
						}
					}), t._v(" "), e("div", {
						staticClass: "panel"
					}, [e("div", {
						staticClass: "panel-title"
					}, t._l(t.postlist, function(s, i) {
						return e("div", {
							key: s.title,
							staticClass: "title-list",
							class: [i == t.indexshow ? "active" : ""],
							on: {
								click: function(s) {
									t.indexshow = i
								}
							}
						}, [t._v(t._s(s.title))])
					}), 0), t._v(" "), t._l(t.postlist, function(s, i) {
						return e("div", {
							directives: [{
								name: "show",
								rawName: "v-show",
								value: i == t.indexshow,
								expression: "index == indexshow"
							}],
							key: i,
							staticClass: "panel-main"
						}, [e("Postlist", {
							attrs: {
								panels: s
							}
						})], 1)
					})], 2)], 1)
				},
				staticRenderFns: []
			};
		var u = e("VU/8")(l, c, !1, function(t) {
			e("nrL4")
		}, "data-v-93d5b51e", null);
		s.default = u.exports
	},
	nrL4: function(t, s) {}
});