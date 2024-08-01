webpackJsonp([27], {
    "+skl": function(t, e) {},
    "+x/O": function(t, e) {},
    DfDl: function(t, e) {
        e.install = function(t, e) {
            t.prototype.auth = function() {
                if ("login" !== this.$store.state.user.status) return this.$store.commit("logoutupdate"), !0
            }
        }
    },
    NHnr: function(t, e, n) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var a = n("7+uW"),
            o = n("58JO"),
            i = {
                name: "sticky",
                data: function() {
                    return {
                        initTimes: 0
                    }
                },
                created: function() {
                    this.$vux && this.$vux.bus && this.$vux.bus.$on("vux:after-view-enter", this.bindSticky)
                },
                activated: function() {
                    this.initTimes > 0 && this.bindSticky(), this.initTimes++
                },
                mounted: function() {
                    var t = this;
                    this.$nextTick(function() {
                        t.bindSticky()
                    })
                },
                beforeDestroy: function() {
                    this.$vux && this.$vux.bus && this.$vux.bus.$off("vux:after-view-enter", this.bindSticky)
                },
                methods: {
                    bindSticky: function() {
                        var t = this;
                        this.disabled || this.$nextTick(function() {
                            Object(o.a)(t.$el, {
                                scrollBox: t.scrollBox,
                                offset: t.offset,
                                checkStickySupport: void 0 === t.checkStickySupport || t.checkStickySupport
                            })
                        })
                    }
                },
                props: ["scrollBox", "offset", "checkStickySupport", "disabled"]
            },
            s = {
                render: function() {
                    var t = this.$createElement;
                    return (this._self._c || t)("div", {
                        staticClass: "vux-sticky-box"
                    }, [this._t("default")], 2)
                },
                staticRenderFns: []
            };
        var r = n("VU/8")(i, s, !1, function(t) {
                n("gWEZ")
            }, null, null).exports,
            c = {
                components: {
                    Sticky: r
                },
                computed: {
                    user: function() {
                        return this.$store.state.user
                    },
                    config: function() {
                        return window.config
                    }
                },
                methods: {
                    goTo: function(t) {
                        this.$router.push({
                            path: t
                        })
                    },
                    login: function() {
                        this.auth() || this.$router.push({
                            path: "/user"
                        })
                    }
                },
                mounted: function() {}
            },
            u = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("sticky", [n("div", {
                        staticClass: "header"
                    }, [n("div", {
                        staticClass: "logo",
                        on: {
                            click: function(e) {
                                return t.goTo("/index")
                            }
                        }
                    }, ["Qinmei" == t.config.basename ? [n("i", {
                        staticClass: "iconfont icon-qinmei"
                    })] : [n("span", {
                        staticClass: "nav-website-logo"
                    }, [t._v(t._s(t.config.basename))])]], 2), t._v(" "), n("div", {
                        staticClass: "user"
                    }, [n("i", {
                        staticClass: "iconfont icon-sousuo",
                        on: {
                            click: function(e) {
                                return t.goTo("/search")
                            }
                        }
                    }), t._v(" "), "logout" == t.user.status ? n("i", {
                        staticClass: "iconfont icon-yonghu",
                        on: {
                            click: t.login
                        }
                    }) : n("div", {
                        staticClass: "nav-avatar",
                        style: {
                            backgroundImage: "url(" + t.user.avatar + ")"
                        },
                        on: {
                            click: t.login
                        }
                    })])])])
                },
                staticRenderFns: []
            };
        var l = n("VU/8")(c, u, !1, function(t) {
                n("XCN1")
            }, "data-v-176adeae", null).exports,
            m = n("mtWM"),
            p = n.n(m),
            d = {
                data: function() {
                    return {
                        themevalidate: ""
                    }
                },
                computed: {
                    config: function() {
                        return this.$store.state.config
                    },
                    tongjima: function() {
                        return this.config.tongji
                    }
                },
                watch: {
                    $route: function(t, e) {
                        t.path && _hmt.push(["_trackPageview", t.fullPath])
                    }
                },
                methods: {
                    gotoinfo: function() {
                        this.$router.push({
                            path: "/post/" + this.$store.state.config.termid.page.info
                        })
                    },
                    gototheme: function() {
                        this.$router.push({
                            path: "/post/" + this.$store.state.config.termid.page.theme
                        })
                    },
                    tongji: function() {
                        var t = document.createElement("script");
                        t.innerHTML = '\n          var _hmt = _hmt || [];\n          (function() {\n            var hm = document.createElement("script");\n            hm.src = "' + this.tongjima + '";\n            var s = document.getElementsByTagName("script")[0]; \n            s.parentNode.insertBefore(hm, s);\n          })();\n          ', document.body.appendChild(t)
                    }
                },
                mounted: function() {
                    this.tongji()
                }
            },
            h = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("div", {
                        staticClass: "footer"
                    }, [n("div", {
                        staticClass: "small-line"
                    }), t._v(" "), n("div", {
                        staticClass: "foot-item"
                    }, [n("div", {
                        staticClass: "item-list",
                        on: {
                            click: t.gotoinfo
                        }
                    }, [t._v("\n      关于我们\n    ")]), t._v(" "), n("div", {
                        staticClass: "item-list",
                        on: {
                            click: t.gototheme
                        }
                    }, [t._v("\n      APP下载\n    ")])]), t._v(" "), n("div", {
                        staticClass: "foot-slogan"
                    }, [t._v("\n   " + t._s(t.config.name) + " - " + t._s(t.config.slogan) + "\n  ")])])
                },
                staticRenderFns: []
            };
        var f = n("VU/8")(d, h, !1, function(t) {
                n("+x/O")
            }, "data-v-5dea4ef2", null).exports,
            v = n("mvHQ"),
            g = n.n(v),
            b = n("ytdl"),
            y = n.n(b),
            w = n("cJ47"),
            k = {
                data: function() {
                    return {
                        user: {
                            name: "",
                            pass: ""
                        },
                        passshow: !1
                    }
                },
                computed: {
                    show: function() {
                        return this.$store.state.islogout
                    }
                },
                methods: {
                    showtoggle: function() {
                        this.$store.commit("logoutupdate")
                    },
                    onSubmit: function() {
                        var t = this;
                        p()({
                            method: "post",
                            data: {
                                username: this.user.name,
                                password: this.user.pass
                            },
                            url: window.config.baseurl + "/wp-json/jwt-auth/v1/token"
                        }).then(function(e) {
                            localStorage.token = g()(e.data.token), t.$store.commit("tokenupdate");
                            var n = y()(e.data.token).data.user.id;
                            Object(w.a)({
                                method: "get",
                                url: "/users/" + n,
                                headers: {
                                    Authorization: "Bearer " + e.data.token
                                }
                            }).then(function(e) {
                                t.$Notice.success({
                                    title: "登录成功"
                                }), localStorage.user = g()(e.data), t.$store.commit("userupdate"), t.$store.commit("logoutupdate"), t.user.name = null, t.user.pass = null
                            }).catch(function(e) {
                                t.$Notice.error({
                                    title: "出错了,请稍后重试"
                                })
                            })
                        }).catch(function(e) {
                            e.response && t.$Notice.error({
                                title: e.response.data.message
                            })
                        })
                    }
                }
            },
            _ = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return 1 == t.show ? n("div", {
                        staticClass: "auth-bg",
                        on: {
                            click: t.showtoggle
                        }
                    }, [n("div", {
                        staticClass: "auth-model",
                        on: {
                            click: function(t) {
                                t.stopPropagation()
                            }
                        }
                    }, [n("div", {
                        staticClass: "model-container"
                    }, [t._m(0), t._v(" "), n("div", {
                        staticClass: "model-middle"
                    }, [n("form", {
                        on: {
                            submit: function(e) {
                                return e.preventDefault(), t.onSubmit(e)
                            }
                        }
                    }, [n("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.user.name,
                            expression: "user.name"
                        }],
                        attrs: {
                            type: "text",
                            placeholder: "用户名或邮箱"
                        },
                        domProps: {
                            value: t.user.name
                        },
                        on: {
                            input: function(e) {
                                e.target.composing || t.$set(t.user, "name", e.target.value)
                            }
                        }
                    }), t._v(" "), n("div", {
                        staticClass: "pass-con"
                    }, [0 == t.passshow ? n("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.user.pass,
                            expression: "user.pass"
                        }],
                        attrs: {
                            type: "password",
                            placeholder: "用户密码"
                        },
                        domProps: {
                            value: t.user.pass
                        },
                        on: {
                            input: function(e) {
                                e.target.composing || t.$set(t.user, "pass", e.target.value)
                            }
                        }
                    }) : n("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.user.pass,
                            expression: "user.pass"
                        }],
                        attrs: {
                            type: "text",
                            placeholder: "用户密码"
                        },
                        domProps: {
                            value: t.user.pass
                        },
                        on: {
                            input: function(e) {
                                e.target.composing || t.$set(t.user, "pass", e.target.value)
                            }
                        }
                    }), t._v(" "), n("span", {
                        staticClass: "pass-toggle",
                        on: {
                            click: function(e) {
                                t.passshow = !t.passshow
                            }
                        }
                    }, [1 == t.passshow ? n("Icon", {
                        attrs: {
                            type: "md-eye"
                        }
                    }) : n("Icon", {
                        attrs: {
                            type: "md-eye-off"
                        }
                    })], 1)]), t._v(" "), n("router-link", {
                        staticClass: "form-reset-pass",
                        attrs: {
                            tag: "span",
                            to: {
                                path: "/auth/reset"
                            }
                        }
                    }, [t._v("忘记密码?")]), t._v(" "), n("input", {
                        staticClass: "submit",
                        attrs: {
                            type: "submit",
                            name: "submit",
                            value: "登录"
                        }
                    })], 1)]), t._v(" "), n("div", {
                        staticClass: "model-footer"
                    }, [n("span", [t._v("没有账号?")]), t._v(" "), n("router-link", {
                        staticClass: "form-footer-register",
                        attrs: {
                            tag: "span",
                            to: {
                                path: "/auth/register"
                            }
                        }
                    }, [t._v("现在注册")])], 1)])])]) : t._e()
                },
                staticRenderFns: [function() {
                    var t = this.$createElement,
                        e = this._self._c || t;
                    return e("div", {
                        staticClass: "model-header"
                    }, [e("p", [this._v("登录账号才能使用哦")])])
                }]
            };
        var $ = n("VU/8")(k, _, !1, function(t) {
                n("RubK")
            }, null, null).exports,
            x = {
                components: {
                    Nav: l,
                    Foot: f,
                    Auth: $
                },
                data: function() {
                    return {
                        first: !0
                    }
                },
                computed: {
                    propshow: function() {
                        return this.$store.state.islogout
                    },
                    mindex: function() {
                        return window.config.mindex ? window.config.mindex : this.$store.state.config.img.mindex
                    }
                },
                methods: {
                    hidebg: function() {
                        var t = this;
                        sessionStorage.first && 1 != sessionStorage.first ? this.first = !1 : setTimeout(function() {
                            t.first = !1
                        }, 3e3), sessionStorage.first = !0
                    },
                    loginconfirm: function() {
                        if (localStorage.token) {
                            var t = JSON.parse(localStorage.token),
                                e = y()(t),
                                n = (new Date).getTime() / 1e3;
                            e.exp > n && (localStorage.user ? (this.$store.commit("userupdate"), this.$store.commit("tokenupdate")) : localStorage.token = "")
                        }
                    }
                },
                created: function() {
                    this.$store.dispatch("testwebconfig"), this.hidebg(), this.loginconfirm()
                },
                beforeUpdated: function() {
                    this.loginconfirm()
                }
            },
            S = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        n = t._self._c || e;
                    return n("div", {
                        staticClass: "mobile"
                    }, [n("transition", {
                        attrs: {
                            name: "fade"
                        }
                    }, [1 == t.first ? n("div", {
                        staticClass: "cover",
                        style: {
                            backgroundImage: "url(" + t.mindex + ")"
                        }
                    }) : t._e()]), t._v(" "), 0 == t.first ? [!1 !== t.$route.meta.navshow ? n("Nav") : t._e(), t._v(" "), n("router-view"), t._v(" "), n("Foot"), t._v(" "), n("Auth")] : t._e()], 2)
                },
                staticRenderFns: []
            };
        var C = n("VU/8")(x, S, !1, function(t) {
                n("pSLR")
            }, null, null).exports,
            P = n("/ocq"),
            N = n("l+I4");
        a.default.use(P.a);
        var O = {
                mode: "history",
                routes: [{
                    path: "/index",
                    meta: {
                        title: "一个在线动漫播放网站"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(5)]).then(function() {
                            var e = [n("8hXn")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/new",
                    meta: {
                        title: "新番连载"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(6)]).then(function() {
                            var e = [n("Y6A4")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/topic",
                    meta: {
                        title: "分类动漫"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(9)]).then(function() {
                            var e = [n("cOqS")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/discuss",
                    meta: {
                        title: "动态讨论"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(17)]).then(function() {
                            var e = [n("WMEK")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/user",
                    children: [{
                        path: "",
                        meta: {
                            title: "用户中心",
                            navshow: !1
                        },
                        component: function(t) {
                            return n.e(23).then(function() {
                                var e = [n("k4Tb")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "history",
                        meta: {
                            title: "历史记录",
                            navshow: !1
                        },
                        component: function(t) {
                            return Promise.all([n.e(0), n.e(8)]).then(function() {
                                var e = [n("F2NL")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "like",
                        meta: {
                            title: "我的追番",
                            navshow: !1
                        },
                        component: function(t) {
                            return Promise.all([n.e(0), n.e(25)]).then(function() {
                                var e = [n("8oog")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "member",
                        meta: {
                            title: "会员等级",
                            navshow: !1
                        },
                        component: function(t) {
                            return n.e(11).then(function() {
                                var e = [n("f/j2")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "animate",
                        meta: {
                            title: "我的番剧",
                            navshow: !1
                        },
                        component: function(t) {
                            return Promise.all([n.e(0), n.e(7)]).then(function() {
                                var e = [n("0dZl")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "longpost",
                        meta: {
                            title: "我的长文",
                            navshow: !1
                        },
                        component: function(t) {
                            return n.e(15).then(function() {
                                var e = [n("BusT")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "comment",
                        meta: {
                            title: "我的评论",
                            navshow: !1
                        },
                        component: function(t) {
                            return Promise.all([n.e(0), n.e(10)]).then(function() {
                                var e = [n("Ge6b")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "public",
                        meta: {
                            title: "系统通知",
                            navshow: !1
                        },
                        component: function(t) {
                            return n.e(22).then(function() {
                                var e = [n("OeIj")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }],
                    component: function(t) {
                        return n.e(13).then(function() {
                            var e = [n("nXOw")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/setting",
                    meta: {
                        title: "用户设置"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(2)]).then(function() {
                            var e = [n("77Zy")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/search",
                    meta: {
                        title: "搜索",
                        navshow: !1
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(21)]).then(function() {
                            var e = [n("2QH8")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/animate/:slug",
                    meta: {
                        title: "动漫"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(1)]).then(function() {
                            var e = [n("bP5g")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/play",
                    meta: {
                        title: "播放",
                        navshow: !1
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(4)]).then(function() {
                            var e = [n("SHt1")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/cat/:cat",
                    meta: {
                        title: "分类"
                    },
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(19)]).then(function() {
                            var e = [n("uEKL")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/postcat/:cat",
                    meta: {
                        title: "分类"
                    },
                    component: function(t) {
                        return n.e(24).then(function() {
                            var e = [n("HTyd")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/post/:id",
                    meta: {
                        title: "文章"
                    },
                    name: "post",
                    component: function(t) {
                        return Promise.all([n.e(0), n.e(3)]).then(function() {
                            var e = [n("WUAQ")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "/auth",
                    children: [{
                        path: "login",
                        meta: {
                            title: "登录"
                        },
                        component: function(t) {
                            return n.e(12).then(function() {
                                var e = [n("N/Di")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "register",
                        meta: {
                            title: "注册"
                        },
                        component: function(t) {
                            return n.e(20).then(function() {
                                var e = [n("NBc0")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "reset",
                        meta: {
                            title: "发送邮件"
                        },
                        component: function(t) {
                            return n.e(16).then(function() {
                                var e = [n("MXlI")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }, {
                        path: "validate",
                        meta: {
                            title: "重置密码"
                        },
                        component: function(t) {
                            return n.e(18).then(function() {
                                var e = [n("aSk3")];
                                t.apply(null, e)
                            }.bind(this)).catch(n.oe)
                        }
                    }],
                    component: function(t) {
                        return n.e(14).then(function() {
                            var e = [n("iqWT")];
                            t.apply(null, e)
                        }.bind(this)).catch(n.oe)
                    }
                }, {
                    path: "*",
                    redirect: "/index"
                }]
            },
            T = new P.a(O);
        T.afterEach(function(t, e, n) {
            window.scrollTo(0, 0)
        }), T.beforeEach(function(t, e, n) {
            window.document.title = window.config.basename + " - " + t.meta.title, n()
        });
        var j = T,
            I = n("DfDl"),
            E = n.n(I),
            J = n("Fn0J"),
            B = n.n(J),
            D = n("BTaQ"),
            R = n.n(D);
        n("+skl");
        a.default.use(R.a), a.default.use(B.a), a.default.use(E.a), a.default.config.productionTip = !1, new a.default({
            el: "#app",
            router: j,
            store: N.a,
            components: {
                App: C
            },
            template: "<App/>"
        })
    },
    RubK: function(t, e) {},
    XCN1: function(t, e) {},
    cJ47: function(t, e, n) {
        "use strict";
        var a = n("mtWM"),
            o = n.n(a),
            i = n("l+I4"),
            s = n("L6bb"),
            r = (n.n(s), o.a.create({
                baseURL: window.config.baseurl + "/wp-json/wp/v2/",
                timeout: "30000",
                headers: {
                    "Content-Type": "application/json;"
                }
            }));
        r.interceptors.request.use(function(t) {
            return "" != i.a.state.token && (t.headers.Authorization = "Bearer " + i.a.state.token), t
        }), e.a = r
    },
    gWEZ: function(t, e) {},
    "l+I4": function(t, e, n) {
        "use strict";
        var a, o = n("fZjL"),
            i = n.n(o),
            s = n("mvHQ"),
            r = n.n(s),
            c = n("Gu7T"),
            u = n.n(c),
            l = n("bOdI"),
            m = n.n(l),
            p = n("7+uW"),
            d = n("NYxO"),
            h = n("cJ47"),
            f = n("mtWM");
        n.n(f);
        p.default.use(d.a);
        var v = new d.a.Store({
            state: {
                token: "",
                islogout: !1,
                user: (a = {
                    name: "",
                    email: "",
                    avatar: "",
                    bgimg: "",
                    level: "",
                    aid: "",
                    sorce: ""
                }, m()(a, "level", ""), m()(a, "desc", ""), m()(a, "status", "logout"), a),
                config: {},
                animate: {
                    time: {
                        day1: [],
                        day3: [],
                        day2: [],
                        day5: [],
                        day6: [],
                        day4: [],
                        day7: [],
                        recommend: [],
                        top: [],
                        scroll: [],
                        all: [],
                        random: [],
                        fight: [],
                        fun: [],
                        daily: [],
                        cure: [],
                        world: [],
                        depress: [],
                        rate: []
                    },
                    total: {
                        recommend: 0,
                        all: 0,
                        fight: 0,
                        fun: 0,
                        daily: 0,
                        cure: 0,
                        world: 0,
                        depress: 0,
                        rate: 0
                    }
                },
                util: {
                    recommend: "站长推荐",
                    fight: "战斗番剧",
                    fun: "搞笑番剧",
                    daily: "日常番剧",
                    cure: "治愈番剧",
                    depress: "致郁番剧",
                    world: "异界番剧",
                    all: "所有番剧",
                    rate: "评分排行"
                }
            },
            mutations: {
                userupdate: function(t) {
                    var e = JSON.parse(localStorage.user);
                    t.user.name = e.name, t.user.email = e.email, t.user.avatar = e.qinmei.vue_avatar, t.user.bgimg = e.qinmei.vue_backimg, t.user.level = e.node.level, t.user.aid = e.node.aid, t.user.sorce = e.node.sorce, t.user.desc = e.description, t.user.status = "login"
                },
                tokenupdate: function(t) {
                    var e = JSON.parse(localStorage.token);
                    t.token = e
                },
                logoutupdate: function(t) {
                    t.islogout = !t.islogout, t.user.name = "", t.user.email = "", t.user.avatar = "", t.user.bgimg = "", t.user.level = "", t.user.aid = "", t.user.sorce = "", t.user.level = "", t.user.desc = ""
                },
                configupdate: function(t, e) {
                    t.config = e
                },
                catupdate: function(t, e) {
                    t.animate.time[e.name] = e.list, t.animate.total[e.name] = e.total
                },
                randomupdate: function(t, e) {
                    t.animate.time.random = [].concat(u()(t.animate.time.random), u()(e))
                },
                savewebconfig: function(t) {
                    var e = new Date;
                    localStorage.config = r()({
                        time: e.getTime(),
                        data: t.config
                    })
                },
                initwebconfig: function(t) {
                    t.config = JSON.parse(localStorage.config).data
                }
            },
            actions: {
                getConfig: function(t) {
                    var e = t.dispatch,
                        n = t.commit;
                    Object(h.a)({
                        method: "get",
                        url: "/qinmei/config"
                    }).then(function(t) {
                        n("configupdate", t.data), n("savewebconfig"), e("testwebdata")
                    })
                },
                getanimatecat: function(t) {
                    var e = t.state,
                        n = t.commit,
                        a = function(t) {
                            Object(h.a)({
                                method: "get",
                                url: "/animate",
                                params: {
                                    animatecat: e.config.termid.cat[t],
                                    per_page: 30,
                                    page: 1
                                }
                            }).then(function(e) {
                                n("catupdate", {
                                    name: t,
                                    list: e.data,
                                    total: parseInt(e.headers["x-wp-total"])
                                })
                            })
                        };
                    for (var o in e.config.termid.cat) a(o)
                },
                getanimatekind: function(t) {
                    var e = t.state,
                        n = t.commit,
                        a = function(t) {
                            Object(h.a)({
                                method: "get",
                                url: "/animate",
                                params: {
                                    animatekind: e.config.termid.kind[t],
                                    per_page: 30,
                                    page: 1
                                }
                            }).then(function(e) {
                                n("catupdate", {
                                    name: t,
                                    list: e.data,
                                    total: parseInt(e.headers["x-wp-total"])
                                })
                            })
                        };
                    for (var o in e.config.termid.kind) a(o)
                },
                getanimateall: function(t) {
                    t.state;
                    var e = t.commit;
                    Object(h.a)({
                        method: "get",
                        url: "/animate",
                        params: {
                            per_page: 30,
                            page: 1
                        }
                    }).then(function(t) {
                        e("catupdate", {
                            name: "all",
                            list: t.data,
                            total: parseInt(t.headers["x-wp-total"])
                        })
                    })
                },
                getanimaterate: function(t) {
                    t.state;
                    var e = t.commit;
                    Object(h.a)({
                        method: "get",
                        url: "/animate?orderby=baseinfo_rate",
                        params: {
                            per_page: 30,
                            page: 1
                        }
                    }).then(function(t) {
                        e("catupdate", {
                            name: "rate",
                            list: t.data,
                            total: parseInt(t.headers["x-wp-total"])
                        })
                    })
                },
                getanimaterandom: function(t) {
                    t.state;
                    var e = t.commit;
                    Object(h.a)({
                        method: "get",
                        url: "/animate?per_page=10&orderby=rand"
                    }).then(function(t) {
                        e("randomupdate", t.data)
                    })
                },
                testwebconfig: function(t) {
                    var e = t.dispatch,
                        n = t.commit;
                    if (localStorage.getItem("config")) {
                        var a = JSON.parse(localStorage.config);
                        (new Date).getTime() - 6048e5 - a.time < 0 && 0 !== i()(a.data).length ? (n("initwebconfig"), e("testwebdata")) : e("getConfig")
                    } else e("getConfig")
                },
                testwebdata: function(t) {
                    var e = t.dispatch;
                    t.commit;
                    e("getanimatecat"), e("getanimaterate"), e("getanimateall"), e("getanimaterandom")
                },
                updateanimatecat: function(t, e) {
                    var n = t.state,
                        a = t.commit,
                        o = "";
                    o = "recommend" == e.type ? "/animate?animatecat=" + n.config.termid.cat[e.type] : "all" == e.type ? "/animate" : "rate" == e.type ? "/animate?orderby=baseinfo_rate" : "/animate?animatekind=" + n.config.termid.kind[e.type], Object(h.a)({
                        method: "get",
                        url: o,
                        params: e.params
                    }).then(function(t) {
                        a("catupdate", {
                            name: e.type,
                            list: t.data,
                            total: parseInt(t.headers["x-wp-total"])
                        })
                    })
                }
            }
        });
        e.a = v
    },
    pSLR: function(t, e) {}
}, ["NHnr"]);