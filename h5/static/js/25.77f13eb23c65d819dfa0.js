webpackJsonp([25], {
    "8oog": function(t, e, a) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        a("ytdl");
        var i = a("pjeT"),
            n = a("cJ47"),
            s = (i.a, {
                components: {
                    List: i.a
                },
                data: function() {
                    return {
                        userdata: {
                            history: []
                        },
                        disabled: !1
                    }
                },
                methods: {
                    initData: function() {
                        var t = this;
                        Object(n.a)({
                            method: "post",
                            url: "/userdata/info",
                            data: {
                                type: "animate_like"
                            }
                        }).then(function(e) {
                            "404" !== e.data && (t.userdata.history = e.data, t.$Spin.hide())
                        }).catch(function(t) {
                            console.log("连接错误")
                        })
                    }
                },
                mounted: function() {
                    this.$Spin.show(), this.initData()
                }
            }),
            o = {
                render: function() {
                    var t = this.$createElement,
                        e = this._self._c || t;
                    return e("div", {
                        staticClass: "user-history"
                    }, [e("List", {
                        attrs: {
                            list: this.userdata.history,
                            simple: "true"
                        }
                    })], 1)
                },
                staticRenderFns: []
            };
        var r = a("VU/8")(s, o, !1, function(t) {
            a("qglZ")
        }, null, null);
        e.default = r.exports
    },
    qglZ: function(t, e) {}
});