webpackJsonp([14], {
    c9Sp: function(t, e) {},
    iqWT: function(t, e, o) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var s = {
            render: function() {
                var t = this.$createElement,
                    e = this._self._c || t;
                return e("div", {
                    staticClass: "user-auth"
                }, [e("router-view")], 1)
            },
            staticRenderFns: []
        };
        var i = o("VU/8")({
            mounted: function() {
                1 == this.$store.state.islogout && this.$store.commit("logoutupdate")
            },
            beforeUpdate: function() {
                1 == this.$store.state.islogout && this.$store.commit("logoutupdate")
            }
        }, s, !1, function(t) {
            o("c9Sp")
        }, null, null);
        e.default = i.exports
    }
});