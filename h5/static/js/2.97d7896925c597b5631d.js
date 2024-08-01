webpackJsonp([2], {
    "2LX0": function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        }), e.default = function(t, e) {
            if ((0, n.default)(t), (e = (0, r.default)(e, o)).require_display_name || e.allow_display_name) {
                var i = t.match(u);
                if (i) t = i[1];
                else if (e.require_display_name) return !1
            }
            var l = t.split("@"),
                p = l.pop(),
                v = l.join("@"),
                m = p.toLowerCase();
            "gmail.com" !== m && "googlemail.com" !== m || (v = v.replace(/\./g, "").toLowerCase());
            if (!(0, a.default)(v, {
                    max: 64
                }) || !(0, a.default)(p, {
                    max: 254
                })) return !1;
            if (!(0, s.default)(p, {
                    require_tld: e.require_tld
                })) return !1;
            if ('"' === v[0]) return v = v.slice(1, v.length - 1), e.allow_utf8_local_part ? f.test(v) : d.test(v);
            for (var g = e.allow_utf8_local_part ? h : c, y = v.split("."), b = 0; b < y.length; b++)
                if (!g.test(y[b])) return !1;
            return !0
        };
        var n = l(i("fcJk")),
            r = l(i("LLCR")),
            a = l(i("CFqi")),
            s = l(i("cddD"));

        function l(t) {
            return t && t.__esModule ? t : {
                default: t
            }
        }
        var o = {
                allow_display_name: !1,
                require_display_name: !1,
                allow_utf8_local_part: !0,
                require_tld: !0
            },
            u = /^[a-z\d!#\$%&'\*\+\-\/=\?\^_`{\|}~\.\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+[a-z\d!#\$%&'\*\+\-\/=\?\^_`{\|}~\,\.\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF\s]*<(.+)>$/i,
            c = /^[a-z\d!#\$%&'\*\+\-\/=\?\^_`{\|}~]+$/i,
            d = /^([\s\x01-\x08\x0b\x0c\x0e-\x1f\x7f\x21\x23-\x5b\x5d-\x7e]|(\\[\x01-\x09\x0b\x0c\x0d-\x7f]))*$/i,
            h = /^[a-z\d!#\$%&'\*\+\-\/=\?\^_`{\|}~\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]+$/i,
            f = /^([\s\x01-\x08\x0b\x0c\x0e-\x1f\x7f\x21\x23-\x5b\x5d-\x7e\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]|(\\[\x01-\x09\x0b\x0c\x0d-\x7f\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))*$/i;
        t.exports = e.default
    },
    "5qGI": function(t, e) {},
    "77Zy": function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var n = i("mvHQ"),
            r = i.n(n),
            a = i("fZjL"),
            s = i.n(a),
            l = i("f6Hi"),
            o = (String, Boolean, {
                name: "icon",
                props: {
                    type: String,
                    isMsg: Boolean
                },
                computed: {
                    className: function() {
                        return "weui-icon weui_icon_" + this.type + " weui-icon-" + this.type.replace(/_/g, "-")
                    }
                }
            }),
            u = {
                render: function() {
                    var t = this.$createElement;
                    return (this._self._c || t)("i", {
                        class: [this.className, this.isMsg ? "weui-icon_msg" : ""]
                    })
                },
                staticRenderFns: []
            };
        var c = i("VU/8")(o, u, !1, function(t) {
                i("5qGI")
            }, null, null).exports,
            d = i("rLAy"),
            h = i("kbG3"),
            f = i("2LX0"),
            p = i.n(f),
            v = i("Ewe+"),
            m = i.n(v),
            g = i("y1vT"),
            y = i.n(g).a,
            b = i("lFEC"),
            x = i.n(b),
            _ = (p.a, l.a, h.a, d.a, String, String, String, String, Number, String, Boolean, Boolean, String, String, String, Function, Number, Number, Boolean, String, String, String, String, String, String, Boolean, String, Number, String, String, String, Boolean, {
                email: {
                    fn: p.a,
                    msg: "邮箱格式"
                },
                "china-mobile": {
                    fn: function(t) {
                        return m()(t, "zh-CN")
                    },
                    msg: "手机号码"
                },
                "china-name": {
                    fn: function(t) {
                        return t.length >= 2 && t.length <= 6
                    },
                    msg: "中文姓名"
                }
            }),
            w = {
                name: "x-input",
                created: function() {
                    var t = this;
                    this.currentValue = void 0 === this.value || null === this.value ? "" : this.mask ? this.maskValue(this.value) : this.value, !this.required || void 0 !== this.currentValue && "" !== this.currentValue || (this.valid = !1), this.handleChangeEvent = !0, this.debounce && (this._debounce = y(function() {
                        t.$emit("on-change", t.currentValue)
                    }, this.debounce))
                },
                beforeMount: function() {
                    this.$slots && this.$slots["restricted-label"] && (this.hasRestrictedLabel = !0), this.$slots && this.$slots["right-full-height"] && (this.hasRightFullHeightSlot = !0)
                },
                beforeDestroy: function() {
                    this._debounce && this._debounce.cancel(), window.removeEventListener("resize", this.scrollIntoView)
                },
                mixins: [l.a],
                components: {
                    Icon: c,
                    InlineDesc: h.a,
                    Toast: d.a
                },
                props: {
                    title: {
                        type: String,
                        default: ""
                    },
                    type: {
                        type: String,
                        default: "text"
                    },
                    placeholder: String,
                    value: [String, Number],
                    name: String,
                    readonly: Boolean,
                    disabled: Boolean,
                    keyboard: String,
                    inlineDesc: String,
                    isType: [String, Function],
                    min: Number,
                    max: Number,
                    showClear: {
                        type: Boolean,
                        default: !0
                    },
                    equalWith: String,
                    textAlign: String,
                    autocomplete: {
                        type: String,
                        default: "off"
                    },
                    autocapitalize: {
                        type: String,
                        default: "off"
                    },
                    autocorrect: {
                        type: String,
                        default: "off"
                    },
                    spellcheck: {
                        type: String,
                        default: "false"
                    },
                    novalidate: {
                        type: Boolean,
                        default: !1
                    },
                    iconType: String,
                    debounce: Number,
                    placeholderAlign: String,
                    labelWidth: String,
                    mask: String,
                    shouldToastError: {
                        type: Boolean,
                        default: !0
                    }
                },
                computed: {
                    labelStyles: function() {
                        var t = this.$parent,
                            e = void 0 === t ? {} : t;
                        return {
                            width: this.labelWidthComputed || e.labelWidth || this.labelWidthComputed,
                            textAlign: e.labelAlign,
                            marginRight: e.labelMarginRight
                        }
                    },
                    labelClass: function() {
                        return {
                            "vux-cell-justify": this.$parent && ("justify" === this.$parent.labelAlign || "justify" === this.$parent.$parent.labelAlign)
                        }
                    },
                    pattern: function() {
                        if ("number" === this.keyboard || "china-mobile" === this.isType) return "[0-9]*"
                    },
                    labelWidthComputed: function() {
                        var t = this.title.replace(/[^x00-xff]/g, "00").length / 2 + 1;
                        if (t < 10) return t + "em"
                    },
                    hasErrors: function() {
                        return s()(this.errors).length > 0
                    },
                    inputStyle: function() {
                        if (this.textAlign) return {
                            textAlign: this.textAlign
                        }
                    },
                    showWarn: function() {
                        return !this.novalidate && !this.equalWith && !this.valid && this.firstError && (this.touched || this.forceShowError)
                    }
                },
                mounted: function() {
                    window.addEventListener("resize", this.scrollIntoView)
                },
                methods: {
                    scrollIntoView: function() {
                        var t = this,
                            e = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : 0;
                        /iphone/i.test(navigator.userAgent), "INPUT" !== document.activeElement.tagName && "TEXTAREA" !== document.activeElement.tagName || setTimeout(function() {
                            t.$refs.input.scrollIntoViewIfNeeded(!0)
                        }, e)
                    },
                    onClickErrorIcon: function() {
                        this.shouldToastError && this.firstError && (this.showErrorToast = !0), this.$emit("on-click-error-icon", this.firstError)
                    },
                    maskValue: function(t) {
                        return this.mask ? x.a.toPattern(t, this.mask) : t
                    },
                    reset: function() {
                        var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : "";
                        this.dirty = !1, this.currentValue = t, this.firstError = "", this.valid = !0
                    },
                    clear: function() {
                        this.currentValue = "", this.focus(), this.$emit("on-click-clear-icon")
                    },
                    focus: function() {
                        this.$refs.input.focus()
                    },
                    blur: function() {
                        this.$refs.input.blur()
                    },
                    focusHandler: function(t) {
                        var e = this;
                        this.$emit("on-focus", this.currentValue, t), this.isFocus = !0, setTimeout(function() {
                            !e.$refs.input || e.$refs.input.scrollIntoViewIfNeeded(!1)
                        }, 1e3)
                    },
                    onBlur: function(t) {
                        this.setTouched(), this.validate(), this.isFocus = !1, this.$emit("on-blur", this.currentValue, t)
                    },
                    onKeyUp: function(t) {
                        "Enter" === t.key && (t.target.blur(), this.$emit("on-enter", this.currentValue, t))
                    },
                    getError: function() {
                        var t = s()(this.errors)[0];
                        this.firstError = this.errors[t]
                    },
                    validate: function() {
                        if (void 0 === this.equalWith)
                            if (this.errors = {}, this.currentValue || this.required) {
                                if (!this.currentValue && this.required) return this.valid = !1, this.errors.required = "必填哦", void this.getError();
                                if ("string" == typeof this.isType) {
                                    var t = _[this.isType];
                                    if (t) {
                                        var e = this.currentValue;
                                        if ("china-mobile" === this.isType && "999 9999 9999" === this.mask && (e = this.currentValue.replace(/\s+/g, "")), this.valid = t.fn(e), !this.valid) return this.forceShowError = !0, this.errors.format = t.msg + "格式不对哦~", void this.getError();
                                        delete this.errors.format
                                    }
                                }
                                if ("function" == typeof this.isType) {
                                    var i = this.isType(this.currentValue);
                                    if (this.valid = i.valid, !this.valid) return this.errors.format = i.msg, this.forceShowError = !0, void this.getError();
                                    delete this.errors.format
                                }
                                if (this.min) {
                                    if (this.currentValue.length < this.min) return this.errors.min = "最少应该输入" + this.min + "个字符哦", this.valid = !1, void this.getError();
                                    delete this.errors.min
                                }
                                if (this.max) {
                                    if (this.currentValue.length > this.max) return this.errors.max = "最多可以输入" + this.max + "个字符哦", this.valid = !1, void(this.forceShowError = !0);
                                    this.forceShowError = !1, delete this.errors.max
                                }
                                this.valid = !0
                            } else this.valid = !0;
                        else this.validateEqual()
                    },
                    validateEqual: function() {
                        return !this.equalWith && this.currentValue ? (this.valid = !1, void(this.errors.equal = "输入不一致")) : (this.dirty || this.currentValue.length >= this.equalWith.length) && this.currentValue !== this.equalWith ? (this.valid = !1, void(this.errors.equal = "输入不一致")) : void(!this.currentValue && this.required ? this.valid = !1 : (this.valid = !0, delete this.errors.equal))
                    },
                    _getInputMaskSelection: function(t, e, i, n) {
                        if (!this.mask || n && 0 === e) return t;
                        if ((0 === e && (e = this.lastDirection), e > 0) && !this.mask.substr(t - e, 1).match(/[9SA]/)) return this._getInputMaskSelection(t + 1, e, i, !0);
                        return t
                    }
                },
                data: function() {
                    return {
                        hasRightFullHeightSlot: !1,
                        hasRestrictedLabel: !1,
                        firstError: "",
                        forceShowError: !1,
                        hasLengthEqual: !1,
                        valid: !0,
                        currentValue: "",
                        showErrorToast: !1,
                        isFocus: !1
                    }
                },
                watch: {
                    mask: function(t) {
                        t && this.currentValue && (this.currentValue = this.maskValue(this.currentValue))
                    },
                    valid: function() {
                        this.getError()
                    },
                    value: function(t) {
                        this.currentValue = t
                    },
                    equalWith: function(t) {
                        t && this.equalWith ? (t.length === this.equalWith.length && (this.hasLengthEqual = !0), this.validateEqual()) : this.validate()
                    },
                    currentValue: function(t, e) {
                        var i = this,
                            n = null;
                        !this.equalWith && t && this.validateEqual(), t && this.equalWith ? (t.length === this.equalWith.length && (this.hasLengthEqual = !0), this.validateEqual()) : this.validate();
                        try {
                            n = this.$refs.input.selectionStart;
                            var r = t.length - e.length;
                            n = this._getInputMaskSelection(n, r, this.maskValue(t)), this.lastDirection = r
                        } catch (t) {}
                        this.$emit("input", this.maskValue(t)), this.$nextTick(function() {
                            i.$refs.input.selectionStart !== n && (i.$refs.input.selectionStart = n, i.$refs.input.selectionEnd = n), i.currentValue !== i.maskValue(t) && (i.currentValue = i.maskValue(t))
                        }), this._debounce ? this._debounce() : this.$emit("on-change", t)
                    }
                }
            },
            $ = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        i = t._self._c || e;
                    return i("div", {
                        staticClass: "vux-x-input weui-cell",
                        class: {
                            "weui-cell_warn": t.showWarn,
                            disabled: t.disabled,
                            "vux-x-input-has-right-full": t.hasRightFullHeightSlot
                        }
                    }, [i("div", {
                        staticClass: "weui-cell__hd"
                    }, [t.hasRestrictedLabel ? i("div", {
                        style: t.labelStyles
                    }, [t._t("restricted-label")], 2) : t._e(), t._v(" "), t._t("label", [t.title ? i("label", {
                        staticClass: "weui-label",
                        class: t.labelClass,
                        style: {
                            width: t.labelWidth || t.$parent.labelWidth || t.labelWidthComputed,
                            textAlign: t.$parent.labelAlign,
                            marginRight: t.$parent.labelMarginRight
                        },
                        attrs: {
                            for: "vux-x-input-" + t.uuid
                        },
                        domProps: {
                            innerHTML: t._s(t.title)
                        }
                    }) : t._e(), t._v(" "), t.inlineDesc ? i("inline-desc", [t._v(t._s(t.inlineDesc))]) : t._e()])], 2), t._v(" "), i("div", {
                        staticClass: "weui-cell__bd weui-cell__primary",
                        class: t.placeholderAlign ? "vux-x-input-placeholder-" + t.placeholderAlign : ""
                    }, [t.type && "text" !== t.type ? t._e() : i("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.currentValue,
                            expression: "currentValue"
                        }],
                        ref: "input",
                        staticClass: "weui-input",
                        style: t.inputStyle,
                        attrs: {
                            id: "vux-x-input-" + t.uuid,
                            maxlength: t.max,
                            autocomplete: t.autocomplete,
                            autocapitalize: t.autocapitalize,
                            autocorrect: t.autocorrect,
                            spellcheck: t.spellcheck,
                            type: "text",
                            name: t.name,
                            pattern: t.pattern,
                            placeholder: t.placeholder,
                            readonly: t.readonly,
                            disabled: t.disabled
                        },
                        domProps: {
                            value: t.currentValue
                        },
                        on: {
                            focus: t.focusHandler,
                            blur: t.onBlur,
                            keyup: t.onKeyUp,
                            input: function(e) {
                                e.target.composing || (t.currentValue = e.target.value)
                            }
                        }
                    }), t._v(" "), "number" === t.type ? i("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.currentValue,
                            expression: "currentValue"
                        }],
                        ref: "input",
                        staticClass: "weui-input",
                        style: t.inputStyle,
                        attrs: {
                            id: "vux-x-input-" + t.uuid,
                            maxlength: t.max,
                            autocomplete: t.autocomplete,
                            autocapitalize: t.autocapitalize,
                            autocorrect: t.autocorrect,
                            spellcheck: t.spellcheck,
                            type: "number",
                            name: t.name,
                            pattern: t.pattern,
                            placeholder: t.placeholder,
                            readonly: t.readonly,
                            disabled: t.disabled
                        },
                        domProps: {
                            value: t.currentValue
                        },
                        on: {
                            focus: t.focusHandler,
                            blur: t.onBlur,
                            keyup: t.onKeyUp,
                            input: function(e) {
                                e.target.composing || (t.currentValue = e.target.value)
                            }
                        }
                    }) : t._e(), t._v(" "), "email" === t.type ? i("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.currentValue,
                            expression: "currentValue"
                        }],
                        ref: "input",
                        staticClass: "weui-input",
                        style: t.inputStyle,
                        attrs: {
                            id: "vux-x-input-" + t.uuid,
                            maxlength: t.max,
                            autocomplete: t.autocomplete,
                            autocapitalize: t.autocapitalize,
                            autocorrect: t.autocorrect,
                            spellcheck: t.spellcheck,
                            type: "email",
                            name: t.name,
                            pattern: t.pattern,
                            placeholder: t.placeholder,
                            readonly: t.readonly,
                            disabled: t.disabled
                        },
                        domProps: {
                            value: t.currentValue
                        },
                        on: {
                            focus: t.focusHandler,
                            blur: t.onBlur,
                            keyup: t.onKeyUp,
                            input: function(e) {
                                e.target.composing || (t.currentValue = e.target.value)
                            }
                        }
                    }) : t._e(), t._v(" "), "password" === t.type ? i("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.currentValue,
                            expression: "currentValue"
                        }],
                        ref: "input",
                        staticClass: "weui-input",
                        style: t.inputStyle,
                        attrs: {
                            id: "vux-x-input-" + t.uuid,
                            maxlength: t.max,
                            autocomplete: t.autocomplete,
                            autocapitalize: t.autocapitalize,
                            autocorrect: t.autocorrect,
                            spellcheck: t.spellcheck,
                            type: "password",
                            name: t.name,
                            pattern: t.pattern,
                            placeholder: t.placeholder,
                            readonly: t.readonly,
                            disabled: t.disabled
                        },
                        domProps: {
                            value: t.currentValue
                        },
                        on: {
                            focus: t.focusHandler,
                            blur: t.onBlur,
                            keyup: t.onKeyUp,
                            input: function(e) {
                                e.target.composing || (t.currentValue = e.target.value)
                            }
                        }
                    }) : t._e(), t._v(" "), "tel" === t.type ? i("input", {
                        directives: [{
                            name: "model",
                            rawName: "v-model",
                            value: t.currentValue,
                            expression: "currentValue"
                        }],
                        ref: "input",
                        staticClass: "weui-input",
                        style: t.inputStyle,
                        attrs: {
                            id: "vux-x-input-" + t.uuid,
                            maxlength: t.max,
                            autocomplete: t.autocomplete,
                            autocapitalize: t.autocapitalize,
                            autocorrect: t.autocorrect,
                            spellcheck: t.spellcheck,
                            type: "tel",
                            name: t.name,
                            pattern: t.pattern,
                            placeholder: t.placeholder,
                            readonly: t.readonly,
                            disabled: t.disabled
                        },
                        domProps: {
                            value: t.currentValue
                        },
                        on: {
                            focus: t.focusHandler,
                            blur: t.onBlur,
                            keyup: t.onKeyUp,
                            input: function(e) {
                                e.target.composing || (t.currentValue = e.target.value)
                            }
                        }
                    }) : t._e()]), t._v(" "), i("div", {
                        staticClass: "weui-cell__ft"
                    }, [i("icon", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: !t.hasRightFullHeightSlot && !t.equalWith && t.showClear && "" !== t.currentValue && !t.readonly && !t.disabled && t.isFocus,
                            expression: "!hasRightFullHeightSlot && !equalWith && showClear && currentValue !== '' && !readonly && !disabled && isFocus"
                        }],
                        attrs: {
                            type: "clear"
                        },
                        nativeOn: {
                            click: function(e) {
                                return t.clear(e)
                            }
                        }
                    }), t._v(" "), i("icon", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: t.showWarn,
                            expression: "showWarn"
                        }],
                        staticClass: "vux-input-icon",
                        attrs: {
                            type: "warn",
                            title: t.valid ? "" : t.firstError
                        },
                        nativeOn: {
                            click: function(e) {
                                return t.onClickErrorIcon(e)
                            }
                        }
                    }), t._v(" "), !t.novalidate && t.hasLengthEqual && t.dirty && t.equalWith && !t.valid ? i("icon", {
                        staticClass: "vux-input-icon",
                        attrs: {
                            type: "warn"
                        },
                        nativeOn: {
                            click: function(e) {
                                return t.onClickErrorIcon(e)
                            }
                        }
                    }) : t._e(), t._v(" "), i("icon", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: !t.novalidate && t.equalWith && t.equalWith === t.currentValue && t.valid,
                            expression: "!novalidate && equalWith && equalWith === currentValue && valid"
                        }],
                        attrs: {
                            type: "success"
                        }
                    }), t._v(" "), i("icon", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: t.novalidate && "success" === t.iconType,
                            expression: "novalidate && iconType === 'success'"
                        }],
                        staticClass: "vux-input-icon",
                        attrs: {
                            type: "success"
                        }
                    }), t._v(" "), i("icon", {
                        directives: [{
                            name: "show",
                            rawName: "v-show",
                            value: t.novalidate && "error" === t.iconType,
                            expression: "novalidate && iconType === 'error'"
                        }],
                        staticClass: "vux-input-icon",
                        attrs: {
                            type: "warn"
                        }
                    }), t._v(" "), t._t("right"), t._v(" "), t.hasRightFullHeightSlot ? i("div", {
                        staticClass: "vux-x-input-right-full"
                    }, [t._t("right-full-height")], 2) : t._e()], 2), t._v(" "), i("toast", {
                        attrs: {
                            type: "text",
                            width: "auto",
                            time: 600
                        },
                        model: {
                            value: t.showErrorToast,
                            callback: function(e) {
                                t.showErrorToast = e
                            },
                            expression: "showErrorToast"
                        }
                    }, [t._v(t._s(t.firstError))])], 1)
                },
                staticRenderFns: []
            };
        var S = i("VU/8")(w, $, !1, function(t) {
                i("kBJl")
            }, null, null).exports,
            k = i("ytdl"),
            E = i.n(k),
            F = (i("mtWM"), i("cJ47")),
            C = (d.a, {
                components: {
                    XInput: S,
                    Toast: d.a
                },
                data: function() {
                    return {
                        nowuser: {
                            email: "",
                            desc: "",
                            avatar: ""
                        },
                        tips: !1
                    }
                },
                computed: {
                    user: function() {
                        return this.$store.state.user
                    }
                },
                methods: {
                    initData: function() {
                        this.nowuser.email = this.user.email, this.nowuser.avatar = this.user.avatar, this.nowuser.desc = this.user.desc
                    },
                    emailchange: function() {
                        var t = {
                            email: this.nowuser.email
                        };
                        this.getinfo(t)
                    },
                    descchange: function() {
                        var t = {
                            description: this.nowuser.desc
                        };
                        this.getinfo(t)
                    },
                    getinfo: function(t) {
                        var e = this,
                            i = E()(localStorage.token).data.user.id;
                        Object(F.a)({
                            method: "post",
                            url: "/users/" + i,
                            data: t
                        }).then(function(t) {
                            e.tips = !0, localStorage.user = r()(t.data), e.$store.commit("userupdate", t.data), e.nowuser.avatar = e.user.avatar
                        }).catch(function(t) {
                            console.log("链接错误")
                        })
                    },
                    update: function(t) {
                        var e = this,
                            i = t.target.files[0],
                            n = new FormData;
                        n.append("file", i), n.append("key", "avatar"), Object(F.a)({
                            url: "/media",
                            method: "post",
                            data: n
                        }).then(function(t) {
                            var i = {
                                qinmei: {
                                    vue_avatar: t.data.source_url
                                }
                            };
                            e.getinfo(i)
                        }).catch(function(t) {
                            e.$Notice.error({
                                title: "上传失败"
                            })
                        })
                    },
                    handleClick: function() {
                        this.$refs.input.click()
                    },
                    logout: function() {
                        localStorage.token = "", this.$store.commit("logoutupdate"), this.$router.push({
                            path: "/index"
                        })
                    }
                },
                mounted: function() {
                    this.initData()
                }
            }),
            V = {
                render: function() {
                    var t = this,
                        e = t.$createElement,
                        i = t._self._c || e;
                    return i("div", {
                        staticClass: "setting"
                    }, [i("div", {
                        staticClass: "setting-list"
                    }, [i("x-input", {
                        staticClass: "setting-list-con",
                        attrs: {
                            title: "用户名",
                            "text-align": "right",
                            disabled: ""
                        },
                        model: {
                            value: t.user.name,
                            callback: function(e) {
                                t.$set(t.user, "name", e)
                            },
                            expression: "user.name"
                        }
                    })], 1), t._v(" "), i("div", {
                        staticClass: "setting-line"
                    }), t._v(" "), i("div", {
                        staticClass: "setting-list setting-list-avatar",
                        on: {
                            click: t.handleClick
                        }
                    }, [i("span", [t._v("头像")]), t._v(" "), i("div", {
                        staticClass: "setting-avatar",
                        style: {
                            backgroundImage: "url(" + t.nowuser.avatar + ")"
                        }
                    }), t._v(" "), i("input", {
                        ref: "input",
                        staticClass: "ivu-upload-input",
                        attrs: {
                            type: "file",
                            accept: "image/png,image/gif,image/jpeg"
                        },
                        on: {
                            change: t.update
                        }
                    })]), t._v(" "), i("div", {
                        staticClass: "setting-line"
                    }), t._v(" "), i("div", {
                        staticClass: "setting-list"
                    }, [i("x-input", {
                        staticClass: "setting-list-con",
                        attrs: {
                            title: "邮箱",
                            "text-align": "right"
                        },
                        on: {
                            "on-enter": t.emailchange
                        },
                        model: {
                            value: t.nowuser.email,
                            callback: function(e) {
                                t.$set(t.nowuser, "email", e)
                            },
                            expression: "nowuser.email"
                        }
                    })], 1), t._v(" "), i("div", {
                        staticClass: "setting-line"
                    }), t._v(" "), i("div", {
                        staticClass: "setting-list"
                    }, [i("x-input", {
                        staticClass: "setting-list-con",
                        attrs: {
                            title: "简介",
                            "text-align": "right"
                        },
                        on: {
                            "on-enter": t.descchange
                        },
                        model: {
                            value: t.nowuser.desc,
                            callback: function(e) {
                                t.$set(t.nowuser, "desc", e)
                            },
                            expression: "nowuser.desc"
                        }
                    })], 1), t._v(" "), i("div", {
                        staticClass: "setting-list-logout",
                        on: {
                            click: t.logout
                        }
                    }, [i("span", [t._v("退出登录")])]), t._v(" "), i("toast", {
                        attrs: {
                            type: "text",
                            text: "修改成功"
                        },
                        model: {
                            value: t.tips,
                            callback: function(e) {
                                t.tips = e
                            },
                            expression: "tips"
                        }
                    })], 1)
                },
                staticRenderFns: []
            };
        var T = i("VU/8")(C, V, !1, function(t) {
            i("P6gy")
        }, "data-v-8a1192ec", null);
        e.default = T.exports
    },
    CFqi: function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        });
        var n = "function" == typeof Symbol && "symbol" == typeof Symbol.iterator ? function(t) {
            return typeof t
        } : function(t) {
            return t && "function" == typeof Symbol && t.constructor === Symbol && t !== Symbol.prototype ? "symbol" : typeof t
        };
        e.default = function(t, e) {
            (0, s.default)(t);
            var i = void 0,
                r = void 0;
            "object" === (void 0 === e ? "undefined" : n(e)) ? (i = e.min || 0, r = e.max) : (i = arguments[1], r = arguments[2]);
            var a = encodeURI(t).split(/%..|./).length - 1;
            return a >= i && (void 0 === r || a <= r)
        };
        var r, a = i("fcJk"),
            s = (r = a) && r.__esModule ? r : {
                default: r
            };
        t.exports = e.default
    },
    "Ewe+": function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        }), e.default = function(t, e, i) {
            if ((0, a.default)(t), i && i.strictMode && !t.startsWith("+")) return !1;
            if (e in s) return s[e].test(t);
            if ("any" === e) {
                for (var n in s)
                    if (s.hasOwnProperty(n)) {
                        var r = s[n];
                        if (r.test(t)) return !0
                    } return !1
            }
            throw new Error("Invalid locale '" + e + "'")
        };
        var n, r = i("fcJk"),
            a = (n = r) && n.__esModule ? n : {
                default: n
            };
        var s = {
            "ar-AE": /^((\+?971)|0)?5[024568]\d{7}$/,
            "ar-DZ": /^(\+?213|0)(5|6|7)\d{8}$/,
            "ar-EG": /^((\+?20)|0)?1[012]\d{8}$/,
            "ar-JO": /^(\+?962|0)?7[789]\d{7}$/,
            "ar-SA": /^(!?(\+?966)|0)?5\d{8}$/,
            "ar-SY": /^(!?(\+?963)|0)?9\d{8}$/,
            "be-BY": /^(\+?375)?(24|25|29|33|44)\d{7}$/,
            "bg-BG": /^(\+?359|0)?8[789]\d{7}$/,
            "cs-CZ": /^(\+?420)? ?[1-9][0-9]{2} ?[0-9]{3} ?[0-9]{3}$/,
            "da-DK": /^(\+?45)?\s?\d{2}\s?\d{2}\s?\d{2}\s?\d{2}$/,
            "de-DE": /^(\+?49[ \.\-])?([\(]{1}[0-9]{1,6}[\)])?([0-9 \.\-\/]{3,20})((x|ext|extension)[ ]?[0-9]{1,4})?$/,
            "el-GR": /^(\+?30|0)?(69\d{8})$/,
            "en-AU": /^(\+?61|0)4\d{8}$/,
            "en-GB": /^(\+?44|0)7\d{9}$/,
            "en-HK": /^(\+?852\-?)?[456789]\d{3}\-?\d{4}$/,
            "en-IN": /^(\+?91|0)?[6789]\d{9}$/,
            "en-KE": /^(\+?254|0)?[7]\d{8}$/,
            "en-NG": /^(\+?234|0)?[789]\d{9}$/,
            "en-NZ": /^(\+?64|0)2\d{7,9}$/,
            "en-PK": /^((\+92)|(0092))-{0,1}\d{3}-{0,1}\d{7}$|^\d{11}$|^\d{4}-\d{7}$/,
            "en-RW": /^(\+?250|0)?[7]\d{8}$/,
            "en-SG": /^(\+65)?[89]\d{7}$/,
            "en-TZ": /^(\+?255|0)?[67]\d{8}$/,
            "en-UG": /^(\+?256|0)?[7]\d{8}$/,
            "en-US": /^(\+?1)?[2-9]\d{2}[2-9](?!11)\d{6}$/,
            "en-ZA": /^(\+?27|0)\d{9}$/,
            "en-ZM": /^(\+?26)?09[567]\d{7}$/,
            "es-ES": /^(\+?34)?(6\d{1}|7[1234])\d{7}$/,
            "et-EE": /^(\+?372)?\s?(5|8[1-4])\s?([0-9]\s?){6,7}$/,
            "fa-IR": /^(\+?98[\-\s]?|0)9[0-39]\d[\-\s]?\d{3}[\-\s]?\d{4}$/,
            "fi-FI": /^(\+?358|0)\s?(4(0|1|2|4|5|6)?|50)\s?(\d\s?){4,8}\d$/,
            "fo-FO": /^(\+?298)?\s?\d{2}\s?\d{2}\s?\d{2}$/,
            "fr-FR": /^(\+?33|0)[67]\d{8}$/,
            "he-IL": /^(\+972|0)([23489]|5[012345689]|77)[1-9]\d{6}/,
            "hu-HU": /^(\+?36)(20|30|70)\d{7}$/,
            "id-ID": /^(\+?62|0[1-9])[\s|\d]+$/,
            "it-IT": /^(\+?39)?\s?3\d{2} ?\d{6,7}$/,
            "ja-JP": /^(\+?81|0)[789]0[ \-]?[1-9]\d{2}[ \-]?\d{5}$/,
            "kk-KZ": /^(\+?7|8)?7\d{9}$/,
            "kl-GL": /^(\+?299)?\s?\d{2}\s?\d{2}\s?\d{2}$/,
            "ko-KR": /^((\+?82)[ \-]?)?0?1([0|1|6|7|8|9]{1})[ \-]?\d{3,4}[ \-]?\d{4}$/,
            "lt-LT": /^(\+370|8)\d{8}$/,
            "ms-MY": /^(\+?6?01){1}(([145]{1}(\-|\s)?\d{7,8})|([236789]{1}(\s|\-)?\d{7}))$/,
            "nb-NO": /^(\+?47)?[49]\d{7}$/,
            "nl-BE": /^(\+?32|0)4?\d{8}$/,
            "nn-NO": /^(\+?47)?[49]\d{7}$/,
            "pl-PL": /^(\+?48)? ?[5-8]\d ?\d{3} ?\d{2} ?\d{2}$/,
            "pt-BR": /^(\+?55|0)\-?[1-9]{2}\-?[2-9]{1}\d{3,4}\-?\d{4}$/,
            "pt-PT": /^(\+?351)?9[1236]\d{7}$/,
            "ro-RO": /^(\+?4?0)\s?7\d{2}(\/|\s|\.|\-)?\d{3}(\s|\.|\-)?\d{3}$/,
            "ru-RU": /^(\+?7|8)?9\d{9}$/,
            "sk-SK": /^(\+?421)? ?[1-9][0-9]{2} ?[0-9]{3} ?[0-9]{3}$/,
            "sr-RS": /^(\+3816|06)[- \d]{5,9}$/,
            "th-TH": /^(\+66|66|0)\d{9}$/,
            "tr-TR": /^(\+?90|0)?5\d{9}$/,
            "uk-UA": /^(\+?38|8)?0\d{9}$/,
            "vi-VN": /^(\+?84|0)?((1(2([0-9])|6([2-9])|88|99))|(9((?!5)[0-9])))([0-9]{7})$/,
            "zh-CN": /^(\+?0?86\-?)?1[3456789]\d{9}$/,
            "zh-TW": /^(\+?886\-?|0)?9\d{8}$/
        };
        s["en-CA"] = s["en-US"], s["fr-BE"] = s["nl-BE"], s["zh-HK"] = s["en-HK"], t.exports = e.default
    },
    LLCR: function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        }), e.default = function() {
            var t = arguments.length > 0 && void 0 !== arguments[0] ? arguments[0] : {},
                e = arguments[1];
            for (var i in e) void 0 === t[i] && (t[i] = e[i]);
            return t
        }, t.exports = e.default
    },
    P6gy: function(t, e) {},
    cddD: function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        }), e.default = function(t, e) {
            (0, n.default)(t), (e = (0, r.default)(e, s)).allow_trailing_dot && "." === t[t.length - 1] && (t = t.substring(0, t.length - 1));
            var i = t.split(".");
            if (e.require_tld) {
                var a = i.pop();
                if (!i.length || !/^([a-z\u00a1-\uffff]{2,}|xn[a-z0-9-]{2,})$/i.test(a)) return !1;
                if (/[\s\u2002-\u200B\u202F\u205F\u3000\uFEFF\uDB40\uDC20]/.test(a)) return !1
            }
            for (var l, o = 0; o < i.length; o++) {
                if (l = i[o], e.allow_underscores && (l = l.replace(/_/g, "")), !/^[a-z\u00a1-\uffff0-9-]+$/i.test(l)) return !1;
                if (/[\uff01-\uff5e]/.test(l)) return !1;
                if ("-" === l[0] || "-" === l[l.length - 1]) return !1
            }
            return !0
        };
        var n = a(i("fcJk")),
            r = a(i("LLCR"));

        function a(t) {
            return t && t.__esModule ? t : {
                default: t
            }
        }
        var s = {
            require_tld: !0,
            allow_underscores: !1,
            allow_trailing_dot: !1
        };
        t.exports = e.default
    },
    fcJk: function(t, e, i) {
        "use strict";
        Object.defineProperty(e, "__esModule", {
            value: !0
        }), e.default = function(t) {
            if (!("string" == typeof t || t instanceof String)) throw new TypeError("This library (validator.js) validates strings only")
        }, t.exports = e.default
    },
    kBJl: function(t, e) {},
    lFEC: function(t, e, i) {
        var n, r;
        void 0 === (r = "function" == typeof(n = function() {
            var t = [9, 16, 17, 18, 36, 37, 38, 39, 40, 91, 92, 93],
                e = function(t) {
                    return (t = {
                        delimiter: (t = t || {}).delimiter || ".",
                        lastOutput: t.lastOutput,
                        precision: t.hasOwnProperty("precision") ? t.precision : 2,
                        separator: t.separator || ",",
                        showSignal: t.showSignal,
                        suffixUnit: t.suffixUnit && " " + t.suffixUnit.replace(/[\s]/g, "") || "",
                        unit: t.unit && t.unit.replace(/[\s]/g, "") + " " || "",
                        zeroCents: t.zeroCents
                    }).moneyPrecision = t.zeroCents ? 0 : t.precision, t
                },
                i = function(t, e, i) {
                    for (; e < t.length; e++) "9" !== t[e] && "A" !== t[e] && "S" !== t[e] || (t[e] = i);
                    return t
                },
                n = function(t) {
                    this.elements = t
                };
            n.prototype.unbindElementToMask = function() {
                for (var t = 0, e = this.elements.length; t < e; t++) this.elements[t].lastOutput = "", this.elements[t].onkeyup = !1, this.elements[t].onkeydown = !1, this.elements[t].value.length && (this.elements[t].value = this.elements[t].value.replace(/\D/g, ""))
            }, n.prototype.bindElementToMask = function(e) {
                for (var i = this, n = function(n) {
                        var a = (n = n || window.event).target || n.srcElement;
                        (function(e) {
                            for (var i = 0, n = t.length; i < n; i++)
                                if (e == t[i]) return !1;
                            return !0
                        })(n.keyCode) && setTimeout(function() {
                            i.opts.lastOutput = a.lastOutput, a.value = r[e](a.value, i.opts), a.lastOutput = a.value, a.setSelectionRange && i.opts.suffixUnit && a.setSelectionRange(a.value.length, a.value.length - i.opts.suffixUnit.length)
                        }, 0)
                    }, a = 0, s = this.elements.length; a < s; a++) this.elements[a].lastOutput = "", this.elements[a].onkeyup = n, this.elements[a].value.length && (this.elements[a].value = r[e](this.elements[a].value, this.opts))
            }, n.prototype.maskMoney = function(t) {
                this.opts = e(t), this.bindElementToMask("toMoney")
            }, n.prototype.maskNumber = function() {
                this.opts = {}, this.bindElementToMask("toNumber")
            }, n.prototype.maskAlphaNum = function() {
                this.opts = {}, this.bindElementToMask("toAlphaNumeric")
            }, n.prototype.maskPattern = function(t) {
                this.opts = {
                    pattern: t
                }, this.bindElementToMask("toPattern")
            }, n.prototype.unMask = function() {
                this.unbindElementToMask()
            };
            var r = function(t) {
                if (!t) throw new Error("VanillaMasker: There is no element to bind.");
                var e = "length" in t ? t.length ? t : [] : [t];
                return new n(e)
            };
            return r.toMoney = function(t, i) {
                if ((i = e(i)).zeroCents) {
                    i.lastOutput = i.lastOutput || "";
                    var n = "(" + i.separator + "[0]{0," + i.precision + "})",
                        r = new RegExp(n, "g"),
                        a = t.toString().replace(/[\D]/g, "").length || 0,
                        s = i.lastOutput.toString().replace(/[\D]/g, "").length || 0;
                    t = t.toString().replace(r, ""), a < s && (t = t.slice(0, t.length - 1))
                }
                for (var l = t.toString().replace(/[\D]/g, ""), o = new RegExp("^(0|\\" + i.delimiter + ")"), u = new RegExp("(\\" + i.separator + ")$"), c = l.substr(0, l.length - i.moneyPrecision), d = c.substr(0, c.length % 3), h = new Array(i.precision + 1).join("0"), f = 0, p = (c = c.substr(c.length % 3, c.length)).length; f < p; f++) f % 3 == 0 && (d += i.delimiter), d += c[f];
                d = (d = d.replace(o, "")).length ? d : "0";
                var v = "";
                if (!0 === i.showSignal && (v = t < 0 || t.startsWith && t.startsWith("-") ? "-" : ""), !i.zeroCents) {
                    var m = l.length - i.precision,
                        g = l.substr(m, i.precision),
                        y = g.length,
                        b = i.precision > y ? i.precision : y;
                    h = (h + g).slice(-b)
                }
                return (i.unit + v + d + i.separator + h).replace(u, "") + i.suffixUnit
            }, r.toPattern = function(t, e) {
                var n, r = "object" == typeof e ? e.pattern : e,
                    a = r.replace(/\W/g, ""),
                    s = r.split(""),
                    l = t.toString().replace(/\W/g, ""),
                    o = l.replace(/\W/g, ""),
                    u = 0,
                    c = s.length,
                    d = "object" == typeof e ? e.placeholder : void 0;
                for (n = 0; n < c; n++) {
                    if (u >= l.length) {
                        if (a.length == o.length) return s.join("");
                        if (void 0 !== d && a.length > o.length) return i(s, n, d).join("");
                        break
                    }
                    if ("9" === s[n] && l[u].match(/[0-9]/) || "A" === s[n] && l[u].match(/[a-zA-Z]/) || "S" === s[n] && l[u].match(/[0-9a-zA-Z]/)) s[n] = l[u++];
                    else if ("9" === s[n] || "A" === s[n] || "S" === s[n]) return void 0 !== d ? i(s, n, d).join("") : s.slice(0, n).join("")
                }
                return s.join("").substr(0, n)
            }, r.toNumber = function(t) {
                return t.toString().replace(/(?!^-)[^0-9]/g, "")
            }, r.toAlphaNumeric = function(t) {
                return t.toString().replace(/[^a-z0-9 ]+/i, "")
            }, r
        }) ? n.call(e, i, e, t) : n) || (t.exports = r)
    },
    y1vT: function(t, e, i) {
        (function(e) {
            var i = "Expected a function",
                n = NaN,
                r = "[object Symbol]",
                a = /^\s+|\s+$/g,
                s = /^[-+]0x[0-9a-f]+$/i,
                l = /^0b[01]+$/i,
                o = /^0o[0-7]+$/i,
                u = parseInt,
                c = "object" == typeof e && e && e.Object === Object && e,
                d = "object" == typeof self && self && self.Object === Object && self,
                h = c || d || Function("return this")(),
                f = Object.prototype.toString,
                p = Math.max,
                v = Math.min,
                m = function() {
                    return h.Date.now()
                };

            function g(t) {
                var e = typeof t;
                return !!t && ("object" == e || "function" == e)
            }

            function y(t) {
                if ("number" == typeof t) return t;
                if (function(t) {
                        return "symbol" == typeof t || function(t) {
                            return !!t && "object" == typeof t
                        }(t) && f.call(t) == r
                    }(t)) return n;
                if (g(t)) {
                    var e = "function" == typeof t.valueOf ? t.valueOf() : t;
                    t = g(e) ? e + "" : e
                }
                if ("string" != typeof t) return 0 === t ? t : +t;
                t = t.replace(a, "");
                var i = l.test(t);
                return i || o.test(t) ? u(t.slice(2), i ? 2 : 8) : s.test(t) ? n : +t
            }
            t.exports = function(t, e, n) {
                var r, a, s, l, o, u, c = 0,
                    d = !1,
                    h = !1,
                    f = !0;
                if ("function" != typeof t) throw new TypeError(i);

                function b(e) {
                    var i = r,
                        n = a;
                    return r = a = void 0, c = e, l = t.apply(n, i)
                }

                function x(t) {
                    var i = t - u;
                    return void 0 === u || i >= e || i < 0 || h && t - c >= s
                }

                function _() {
                    var t = m();
                    if (x(t)) return w(t);
                    o = setTimeout(_, function(t) {
                        var i = e - (t - u);
                        return h ? v(i, s - (t - c)) : i
                    }(t))
                }

                function w(t) {
                    return o = void 0, f && r ? b(t) : (r = a = void 0, l)
                }

                function $() {
                    var t = m(),
                        i = x(t);
                    if (r = arguments, a = this, u = t, i) {
                        if (void 0 === o) return function(t) {
                            return c = t, o = setTimeout(_, e), d ? b(t) : l
                        }(u);
                        if (h) return o = setTimeout(_, e), b(u)
                    }
                    return void 0 === o && (o = setTimeout(_, e)), l
                }
                return e = y(e) || 0, g(n) && (d = !!n.leading, s = (h = "maxWait" in n) ? p(y(n.maxWait) || 0, e) : s, f = "trailing" in n ? !!n.trailing : f), $.cancel = function() {
                    void 0 !== o && clearTimeout(o), c = 0, r = u = a = o = void 0
                }, $.flush = function() {
                    return void 0 === o ? l : w(m())
                }, $
            }
        }).call(e, i("DuR2"))
    }
});