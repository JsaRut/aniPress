webpackJsonp([17], {
    WMEK: function(t, s, i) {
        "use strict";
        Object.defineProperty(s, "__esModule", {
            value: !0
        });
        var n = i("k0Pr"),
            o = i("cJ47"),
            e = i("lVAl"),
            c = i("fBcm"),
            a = i("b+jt"),
            r = (n.a, c.a, a.a, e.a, {
                components: {
                    Snav: n.a,
                    Swiper: c.a,
                    SwiperItem: a.a,
                    Comment: e.a
                },
                data: function() {
                    return {
                        swiplist: [],
                        iconlist: ["icon-special-copy", "icon-NEWSIGN", "icon-gonggao", "icon-wenzhangjiankong", "icon-gouwu"],
                        iconcolor: ["#f44236", "#337ab7", "#ff9700", "#a671ff", "#00bcd5"]
                    }
                },
                computed: {
                    topcat: function() {
                        return this.$store.state.config.post.filter(function(t) {
                            return "ding" !== t.slug
                        }).sort(function(t, s) {
                            return t.slug.localeCompare(s.slug)
                        })
                    },
                    postid: function() {
                        return this.$store.state.config.termid.page.discuss
                    },
                    ding: function() {
                        return this.$store.state.config.post.filter(function(t) {
                            return "ding" === t.slug
                        })[0].cat
                    }
                },
                methods: {
                    initScroll: function() {
                        var t = this;
                        Object(o.a)({
                            method: "get",
                            url: "/posts",
                            params: {
                                categories: this.ding,
                                per_page: 6,
                                page: 1
                            }
                        }).then(function(s) {
                            t.swiplist = s.data
                        })
                    },
                    goToCat: function(t) {
                        this.$router.push({
                            path: "/postcat/" + t
                        })
                    },
                    goToPost: function(t) {
                        this.$router.push({
                            path: "/post/" + t
                        })
                    }
                },
                created: function() {
                    this.initScroll()
                }
            }),
            u = {
                render: function() {
                    var t = this,
                        s = t.$createElement,
                        i = t._self._c || s;
                    return i("div", {
                        staticClass: "discuss"
                    }, [i("div", {
                        staticClass: "discuss-top"
                    }, t._l(t.topcat, function(s, n) {
                        return i("div", {
                            staticClass: "top-list",
                            on: {
                                click: function(i) {
                                    return t.goToCat(s.slug)
                                }
                            }
                        }, [i("span", [i("i", {
                            staticClass: "iconfont",
                            class: t.iconlist[n],
                            style: {
                                color: t.iconcolor[n]
                            }
                        })]), t._v(" "), i("span", [t._v(t._s(s.title))])])
                    }), 0), t._v(" "), i("div", {
                        staticClass: "discuss-img"
                    }, [i("swiper", {
                        attrs: {
                            "aspect-ratio": .25,
                            auto: ""
                        }
                    }, t._l(t.swiplist, function(s, n) {
                        return i("swiper-item", {
                            key: n,
                            staticClass: "swiper-list"
                        }, [i("span", {
                            staticClass: "swiper-list-title"
                        }, [t._v(t._s(s.title.rendered))]), t._v(" "), i("div", {
                            staticClass: "swiper-list-img",
                            style: {
                                backgroundImage: "url(" + s.headimg + ")"
                            },
                            on: {
                                click: function(i) {
                                    return t.goToPost(s.id)
                                }
                            }
                        })])
                    }), 1)], 1), t._v(" "), i("div", {
                        staticClass: "discuss-comment"
                    }, [i("Comment", {
                        attrs: {
                            postid: t.postid
                        }
                    })], 1)])
                },
                staticRenderFns: []
            };
        var l = i("VU/8")(r, u, !1, function(t) {
            i("XBJr")
        }, "data-v-5eec283f", null);
        s.default = l.exports
    },
    XBJr: function(t, s) {}
});