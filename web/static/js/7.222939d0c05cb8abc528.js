webpackJsonp([7], {
	"9OKi": function(t, s) {},
	Nnka: function(t, s) {},
	WMEK: function(t, s, e) {
		"use strict";
		Object.defineProperty(s, "__esModule", {
			value: !0
		});
		e("cJ47");
		var n = {
			render: function() {
				var t = this,
					s = t.$createElement,
					e = t._self._c || s;
				return e("div", {
					staticClass: "userinfo"
				}, [e("div", {
					staticClass: "user-avatar"
				}, [e("div", {
					staticClass: "user-avatar-con",
					style: {
						backgroundImage: "url(" + t.user.avatar + ")"
					}
				})]), t._v(" "), e("div", {
					staticClass: "user-name"
				}, [t._v("\n    " + t._s(t.user.name) + "\n  ")]), t._v(" "), e("div", {
					staticClass: "user-count"
				}, t._l(t.userget.count, function(s) {
					return e("div", [e("span", [t._v(t._s(s.name))]), t._v(" "), e("span", [t._v(t._s(s.count))])])
				}), 0), t._v(" "), e("div", {
					staticClass: "user-description"
				}, [t._v("\n    " + t._s(t.user.desc) + "\n  ")])])
			},
			staticRenderFns: []
		};
		var a = e("VU/8")({
				data: function() {
					return {
						userget: {
							count: {
								post: {
									name: "文章",
									count: 0
								},
								comment: {
									name: "评论",
									count: 0
								},
								like: {
									name: "追番",
									count: 0
								}
							}
						}
					}
				},
				methods: {},
				computed: {
					user: function() {
						return this.$store.state.user
					}
				},
				mounted: function() {}
			}, n, !1, function(t) {
				e("9OKi")
			}, "data-v-3b08f6eb", null).exports,
			i = e("BSc5"),
			r = e("RsmR"),
			o = e("lVAl"),
			c = (i.a, r.a, o.a, {
				components: {
					Headimg: i.a,
					Panel: r.a,
					Userinfo: a,
					Comment: o.a
				},
				data: function() {
					return {
						panels: {
							show: 0,
							list: [{
								title: "所有动态",
								slot: "panel1"
							}]
						}
					}
				},
				computed: {
					headimg: function() {
						return {
							img: this.$store.state.config.img.discuss,
							title: "动态讨论"
						}
					},
					postid: function() {
						return this.$store.state.config.termid.page.discuss
					}
				},
				methods: {},
				created: function() {},
				mounted: function() {}
			}),
			u = {
				render: function() {
					var t = this.$createElement,
						s = this._self._c || t;
					return s("div", {
						staticClass: "container"
					}, [s("Headimg", {
						attrs: {
							headimg: this.headimg
						}
					}), this._v(" "), s("div", {
						staticClass: "container-main"
					}, [s("div", {
						staticClass: "con-main-left"
					}, [s("Panel", {
						attrs: {
							panels: this.panels
						}
					}, [s("Comment", {
						attrs: {
							slot: "panel1",
							postid: this.postid
						},
						slot: "panel1"
					})], 1)], 1), this._v(" "), s("div", {
						staticClass: "con-main-right"
					}, [s("Affix", {
						attrs: {
							"offset-top": 60
						}
					}, [s("Userinfo")], 1)], 1)])], 1)
				},
				staticRenderFns: []
			};
		var d = e("VU/8")(c, u, !1, function(t) {
			e("Nnka")
		}, "data-v-20376063", null);
		s.default = d.exports
	}
});