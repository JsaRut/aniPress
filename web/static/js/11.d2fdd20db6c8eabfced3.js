webpackJsonp([11], {
	iqWT: function(t, e, n) {
		"use strict";
		Object.defineProperty(e, "__esModule", {
			value: !0
		});
		var a = {
			render: function() {
				var t = this.$createElement,
					e = this._self._c || t;
				return e("div", {
					staticClass: "container"
				}, [e("div", {
					staticClass: "auth-box",
					style: {
						backgroundImage: "url(" + this.$store.state.config.img.auth + ")"
					}
				}, [e("div", {
					staticClass: "auth-container"
				}, [e("router-view")], 1)])])
			},
			staticRenderFns: []
		};
		var i = n("VU/8")({
			data: function() {
				return {}
			}
		}, a, !1, function(t) {
			n("nj72")
		}, null, null);
		e.default = i.exports
	},
	nj72: function(t, e) {}
});