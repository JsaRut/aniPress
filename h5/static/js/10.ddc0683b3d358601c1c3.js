webpackJsonp([10], {
    "9BRC": function(t, n) {},
    CY4Q: function(t, n) {},
    Ge6b: function(t, n, i) {
        "use strict";
        Object.defineProperty(n, "__esModule", {
            value: !0
        });
        var e = i("ytdl"),
            s = i.n(e),
            a = i("cJ47"),
            o = i("hYS1"),
            c = i("/kga"),
            r = i("Msp2"),
            l = i("ALGc"),
            m = i("rHil"),
            d = i("rLAy"),
            h = (c.a, o.a, r.a, l.a, m.a, d.a, {
                props: ["commentlist"],
                components: {
                    XDialog: c.a,
                    Commentmedia: o.a,
                    Actionsheet: r.a,
                    XTextarea: l.a,
                    Group: m.a,
                    Toast: d.a
                },
                data: function() {
                    return {
                        commentShow: -1,
                        content: "",
                        publishshow: !1,
                        formloading: !1,
                        imglist: [],
                        visible: !1,
                        showimg: "",
                        actionIndex: 0,
                        actionShow: !1,
                        actionMenu: {
                            reply: "回复",
                            like: "收藏",
                            report: "举报"
                        },
                        children: {
                            show: !1,
                            content: "",
                            index: "",
                            parent: "",
                            id: ""
                        },
                        toast: {
                            show: !1,
                            text: ""
                        },
                        loadingmore: "加载更多"
                    }
                },
                filters: {
                    usercontain: function(t) {
                        if (t && t.length > 0 && localStorage.token) {
                            var n = JSON.parse(localStorage.token),
                                i = s()(n).data.user.id;
                            return 1 == t.some(function(t) {
                                return t == i
                            }) ? "active" : ""
                        }
                    }
                },
                computed: {
                    user: function() {
                        return this.$store.state.user
                    }
                },
                methods: {
                    parentOptionShow: function(t, n) {
                        this.actionShow = !0, this.children.parent = t, this.children.index = n, this.children.content = ""
                    },
                    childrenOptionShow: function(t, n, i, e) {
                        var s = this;
                        return function() {
                            s.actionShow = !0, s.children.parent = t, s.children.index = n, s.children.content = "回复" + i + ":", s.children.id = e
                        }
                    },
                    actionClick: function(t) {
                        this.auth() || ("reply" == t ? this.children.show = !0 : "like" == t ? "-1" == this.commentShow ? this.comment(this.children.parent, "like", this.children.index) : this.childcomment(this.children.id, "like", this.children.index) : "report" == t && ("-1" == this.commentShow ? this.comment(this.children.parent, "report", this.children.index) : this.childcomment(this.children.id, "report", this.children.index)))
                    },
                    childrenReply: function(t, n, i) {
                        this.children.id = t, this.children.index = n, this.children.content = "回复" + i + ":", this.children.show = !0
                    },
                    childrensend: function() {
                        var t = this;
                        if (!this.auth()) {
                            var n = this.children.index;
                            Object(a.a)({
                                method: "post",
                                url: "/comments",
                                data: {
                                    post: this.postid,
                                    parent: this.children.parent,
                                    content: this.children.content
                                }
                            }).then(function(i) {
                                t.toast.show = !0, t.toast.text = "发送成功", t.children.show = !1;
                                var e = {
                                    id: i.data.id,
                                    name: i.data.author_name,
                                    avatar: i.data.avatar,
                                    content: i.data.content.rendered,
                                    zan: i.data.qinmei.zan,
                                    unzan: i.data.qinmei.unzan,
                                    report: i.data.qinmei.report,
                                    time: i.data.time
                                };
                                t.commentlist[n].children.push(e), t.children.content = ""
                            }).catch(function(n) {
                                t.toast.show = !0, t.toast.text = "发送失败,请稍后重试"
                            })
                        }
                    },
                    commenthide: function() {
                        this.commentShow = -1
                    },
                    commentshow: function(t) {
                        this.commentShow = t
                    },
                    imgview: function(t) {
                        this.showimg = t, this.visible = !0
                    },
                    comment: function(t, n, i) {
                        var e = this;
                        if (!this.auth() && "login" == this.$store.state.user.status) {
                            var o = JSON.parse(localStorage.token),
                                c = s()(o).data.user.id;
                            Object(a.a)({
                                method: "post",
                                url: "/update/comment",
                                data: {
                                    id: t,
                                    user: c,
                                    meta: {
                                        type: n
                                    }
                                }
                            }).then(function(t) {
                                e.commentlist[i].qinmei[n] = t.data
                            }).catch(function(t) {
                                e.$Notice.error({
                                    title: "产生错误,请稍后重试"
                                })
                            })
                        }
                    },
                    childcomment: function(t, n, i) {
                        var e = this;
                        if (!this.auth() && "login" == this.$store.state.user.status) {
                            var o = JSON.parse(localStorage.token),
                                c = s()(o).data.user.id;
                            Object(a.a)({
                                method: "post",
                                url: "/update/comment",
                                data: {
                                    id: t,
                                    user: c,
                                    meta: {
                                        type: n
                                    }
                                }
                            }).then(function(t) {
                                e.commentlist[e.commentShow].children[i][n] = t.data
                            }).catch(function(t) {
                                e.$Notice.error({
                                    title: "产生错误,请稍后重试"
                                })
                            })
                        }
                    }
                },
                mounted: function() {}
            }),
            u = {
                render: function() {
                    var t = this,
                        n = t.$createElement,
                        i = t._self._c || n;
                    return i("div", {
                        staticClass: "user-comment-list"
                    }, [t._l(t.commentlist, function(n, e) {
                        return t.commentlist.length > 0 ? i("div", {
                            staticClass: "comment-list-parent"
                        }, [i("div", {
                            staticClass: "comment-header"
                        }, [i("div", {
                            staticClass: "comment-avatar",
                            style: {
                                backgroundImage: "url(" + n.avatar + ")"
                            }
                        }), t._v(" "), i("div", {
                            staticClass: "comment-name"
                        }, [i("p", [t._v(t._s(n.author))]), t._v(" "), i("Time", {
                            attrs: {
                                time: n.time
                            }
                        })], 1), t._v(" "), i("div", {
                            staticClass: "comment-header-option",
                            on: {
                                click: function(i) {
                                    return t.parentOptionShow(n.id, e)
                                }
                            }
                        }, [i("i", {
                            staticClass: "iconfont icon-xiala"
                        })])]), t._v(" "), i("div", {
                            staticClass: "comment-main"
                        }, [i("div", {
                            staticClass: "comment-content"
                        }, [t._v("\n      " + t._s(n.info) + "\n      ")]), t._v(" "), i("div", {
                            staticClass: "comment-meta",
                            class: n.qinmei.img.length < 5 ? "active" : ""
                        }, t._l(n.qinmei.img, function(n) {
                            return i("div", {
                                staticClass: "comment-meta-con"
                            }, ["" !== n ? i("div", {
                                staticClass: "comment-meta-img",
                                style: {
                                    backgroundImage: "url(" + n + ")"
                                },
                                attrs: {
                                    alt: ""
                                },
                                on: {
                                    click: function(i) {
                                        return t.imgview(n)
                                    }
                                }
                            }) : t._e()])
                        }), 0), t._v(" "), i("div", {
                            staticClass: "comment-footer"
                        }, [i("div", {
                            staticClass: "footer-button"
                        }, [i("button", {
                            staticClass: "zhihuBtn",
                            class: t._f("usercontain")(n.qinmei.zan),
                            on: {
                                click: function(i) {
                                    return t.comment(n.id, "zan", e)
                                }
                            }
                        }, [i("i", {
                            staticClass: "iconfont icon-up"
                        }), t._v(" "), i("span", [t._v(t._s(n.qinmei.zan.length))])]), t._v(" "), i("button", {
                            staticClass: "zhihuBtn",
                            class: t._f("usercontain")(n.qinmei.unzan),
                            on: {
                                click: function(i) {
                                    return t.comment(n.id, "unzan", e)
                                }
                            }
                        }, [i("i", {
                            staticClass: "iconfont icon-down"
                        }), t._v(" "), i("span", [t._v(t._s(n.qinmei.unzan.length))])])]), t._v(" "), i("div", {
                            staticClass: "footer-icon"
                        }, [n.children ? [t.commentShow == e ? i("div", {
                            staticClass: "footer-icon-list",
                            on: {
                                click: t.commenthide
                            }
                        }, [i("Icon", {
                            attrs: {
                                type: "ios-text",
                                size: "20"
                            }
                        }), t._v(" "), i("span", [t._v("收起")])], 1) : i("div", {
                            staticClass: "footer-icon-list",
                            on: {
                                click: function(n) {
                                    return t.commentshow(e)
                                }
                            }
                        }, [i("Icon", {
                            attrs: {
                                type: "ios-text"
                            }
                        }), t._v(" "), i("span", [t._v(t._s(n.children.length))])], 1)] : t._e(), t._v(" "), i("div", {
                            staticClass: "footer-icon-list",
                            class: t._f("usercontain")(n.qinmei.like),
                            on: {
                                click: function(i) {
                                    return t.comment(n.id, "like", e)
                                }
                            }
                        }, [i("Icon", {
                            attrs: {
                                type: "ios-heart"
                            }
                        })], 1), t._v(" "), i("div", {
                            staticClass: "footer-icon-list",
                            class: t._f("usercontain")(n.qinmei.report),
                            on: {
                                click: function(i) {
                                    return t.comment(n.id, "report", e)
                                }
                            }
                        }, [i("Icon", {
                            attrs: {
                                type: "md-notifications-off"
                            }
                        })], 1)], 2)]), t._v(" "), t.commentShow == e && n.children && n.children.length > 0 ? i("div", {
                            staticClass: "comment-children"
                        }, [i("div", {
                            staticClass: "children-header"
                        }, [i("span", [t._v(t._s(n.children.length) + " 条评论")])]), t._v(" "), t._l(n.children, function(s, a) {
                            return i("div", {
                                staticClass: "children-list"
                            }, [i("div", {
                                staticClass: "children-list-header"
                            }, ["" != s.avatar ? i("Avatar", {
                                attrs: {
                                    shape: "square",
                                    src: s.avatar,
                                    size: "small"
                                }
                            }) : i("Avatar", {
                                attrs: {
                                    shape: "square",
                                    icon: "ios-person",
                                    size: "small"
                                }
                            }), t._v(" "), i("span", {
                                staticClass: "children-list-auhtor"
                            }, [t._v(t._s(s.name))]), t._v(" "), s.name == n.author_name ? i("span", {
                                staticClass: "children-list-auhtor-confirm"
                            }, [i("Tag", {
                                attrs: {
                                    color: "warning"
                                }
                            }, [t._v("作者")])], 1) : t._e(), t._v(" "), i("div", {
                                staticClass: "children-list-icon",
                                class: t._f("usercontain")(s.zan),
                                on: {
                                    click: function(n) {
                                        return t.childcomment(s.id, "zan", a)
                                    }
                                }
                            }, [i("Icon", {
                                attrs: {
                                    type: "md-thumbs-up",
                                    size: "20"
                                }
                            }), t._v(" "), i("span", [t._v(t._s(s.zan.length))])], 1)], 1), t._v(" "), i("div", {
                                directives: [{
                                    name: "touch",
                                    rawName: "v-touch:long",
                                    value: t.childrenOptionShow(n.id, e, s.name, s.id),
                                    expression: "childrenOptionShow(list.id,index,child.name,child.id)",
                                    arg: "long"
                                }],
                                staticClass: "children-list-content",
                                on: {
                                    click: function(i) {
                                        return t.childrenReply(n.id, e, s.name)
                                    }
                                }
                            }, [t._v(t._s(s.content) + "\n            ")])])
                        })], 2) : t._e()])]) : t._e()
                    }), t._v(" "), i("x-dialog", {
                        staticClass: "children-footer",
                        attrs: {
                            "hide-on-blur": "",
                            "dialog-style": {
                                "max-width": "100%",
                                width: "100%",
                                top: "auto",
                                borderRadius: "0"
                            }
                        },
                        model: {
                            value: t.children.show,
                            callback: function(n) {
                                t.$set(t.children, "show", n)
                            },
                            expression: "children.show"
                        }
                    }, [i("x-textarea", {
                        attrs: {
                            max: 200,
                            placeholder: "回复此动态",
                            autosize: ""
                        },
                        model: {
                            value: t.children.content,
                            callback: function(n) {
                                t.$set(t.children, "content", n)
                            },
                            expression: "children.content"
                        }
                    }), t._v(" "), i("div", {
                        staticClass: "children-footer-option"
                    }, [i("span", [i("i", {
                        staticClass: "iconfont icon-biaoqing"
                    })]), t._v(" "), i("span", {
                        on: {
                            click: t.childrensend
                        }
                    }, [i("i", {
                        staticClass: "iconfont icon-send"
                    })])])], 1), t._v(" "), i("x-dialog", {
                        attrs: {
                            "hide-on-blur": "",
                            "dialog-style": {
                                "max-width": "100%",
                                width: "100%",
                                height: "50%",
                                "background-color": "transparent"
                            }
                        },
                        model: {
                            value: t.visible,
                            callback: function(n) {
                                t.visible = n
                            },
                            expression: "visible"
                        }
                    }, [i("p", {
                        staticStyle: {
                            color: "#fff",
                            "text-align": "center"
                        },
                        on: {
                            click: function(n) {
                                t.visible = !1
                            }
                        }
                    }, [i("img", {
                        staticClass: "comment-img-show",
                        attrs: {
                            src: t.showimg,
                            alt: ""
                        }
                    }), t._v(" "), i("br"), t._v(" "), i("br"), t._v(" "), i("svg", {
                        staticClass: "vux-x-icon vux-x-icon-ios-close-outline",
                        staticStyle: {
                            fill: "#fff"
                        },
                        attrs: {
                            type: "ios-close-outline",
                            id: "Layer_1",
                            xmlns: "http://www.w3.org/2000/svg",
                            width: "24",
                            height: "24",
                            viewBox: "0 0 512 512"
                        }
                    }, [i("path", {
                        staticClass: "st0",
                        attrs: {
                            d: "M403.1 108.9c-81.2-81.2-212.9-81.2-294.2 0s-81.2 212.9 0 294.2c81.2 81.2 212.9 81.2 294.2 0s81.2-213 0-294.2zm-12.3 281.9c-74.3 74.3-195.3 74.3-269.6 0-74.3-74.3-74.3-195.3 0-269.6s195.3-74.3 269.6 0c74.4 74.3 74.4 195.3 0 269.6z"
                        }
                    }), i("path", {
                        staticClass: "st0",
                        attrs: {
                            d: "M340.2 160l-84.4 84.2-84-83.8-11.8 11.8 84 83.8-84 83.8 11.8 11.8 84-83.8 84.4 84.2 11.8-11.8-84.4-84.2 84.4-84.2z"
                        }
                    })])])]), t._v(" "), i("actionsheet", {
                        attrs: {
                            menus: t.actionMenu,
                            theme: "android"
                        },
                        on: {
                            "on-click-menu": t.actionClick
                        },
                        model: {
                            value: t.actionShow,
                            callback: function(n) {
                                t.actionShow = n
                            },
                            expression: "actionShow"
                        }
                    })], 2)
                },
                staticRenderFns: []
            };
        var v = i("VU/8")(h, u, !1, function(t) {
                i("9BRC")
            }, "data-v-17ac9b08", null).exports,
            p = {
                components: {
                    Commentlist: v
                },
                data: function() {
                    return {
                        index: 1,
                        comment: {
                            write: [],
                            like: [],
                            report: []
                        }
                    }
                },
                methods: {
                    getcomment: function(t) {
                        var n = this;
                        Object(a.a)({
                            method: "post",
                            url: "/userdata/comment",
                            data: {
                                type: t
                            }
                        }).then(function(i) {
                            i.data && (n.comment[t] = i.data)
                        }).catch(function(t) {
                            console.log("连接错误")
                        })
                    }
                },
                mounted: function() {
                    this.getcomment("write"), this.getcomment("like"), this.getcomment("report")
                }
            },
            f = {
                render: function() {
                    var t = this,
                        n = t.$createElement,
                        i = t._self._c || n;
                    return i("div", {
                        staticClass: "user-comment"
                    }, [i("div", {
                        staticClass: "animate-header"
                    }, [i("div", {
                        staticClass: "animate-header-btn",
                        class: 0 == t.index ? "active" : "",
                        on: {
                            click: function(n) {
                                t.index = 0
                            }
                        }
                    }, [t._v("\n      我的评论\n    ")]), t._v(" "), i("div", {
                        staticClass: "animate-header-btn",
                        class: 1 == t.index ? "active" : "",
                        on: {
                            click: function(n) {
                                t.index = 1
                            }
                        }
                    }, [t._v("\n      我的收藏\n    ")]), t._v(" "), i("div", {
                        staticClass: "animate-header-btn",
                        class: 2 == t.index ? "active" : "",
                        on: {
                            click: function(n) {
                                t.index = 2
                            }
                        }
                    }, [t._v("\n      我的举报\n    ")])]), t._v(" "), i("div", {
                        staticClass: "comment-main"
                    }, [i("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 0 == t.index,
                            expression: "index == 0"
                        }],
                        staticClass: "comment-panel"
                    }, [t.comment.write.length > 0 ? i("div", {
                        staticClass: "comment-panel-show"
                    }, [i("Commentlist", {
                        attrs: {
                            commentlist: t.comment.write
                        }
                    })], 1) : i("div", {
                        staticClass: "comment-panel-hide"
                    })]), t._v(" "), i("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 1 == t.index,
                            expression: "index == 1"
                        }],
                        staticClass: "comment-panel"
                    }, [t.comment.like.length > 0 ? i("div", {
                        staticClass: "comment-panel-show"
                    }, [i("Commentlist", {
                        attrs: {
                            commentlist: t.comment.like
                        }
                    })], 1) : i("div", {
                        staticClass: "comment-panel-hide"
                    })]), t._v(" "), i("div", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: 2 == t.index,
                            expression: "index == 2"
                        }],
                        staticClass: "comment-panel"
                    }, [t.comment.report.length > 0 ? i("div", {
                        staticClass: "comment-panel-show"
                    }, [i("Commentlist", {
                        attrs: {
                            commentlist: t.comment.report
                        }
                    })], 1) : i("div", {
                        staticClass: "comment-panel-hide"
                    })])])])
                },
                staticRenderFns: []
            };
        var _ = i("VU/8")(p, f, !1, function(t) {
            i("CY4Q")
        }, "data-v-3935736c", null);
        n.default = _.exports
    }
});