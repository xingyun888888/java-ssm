webpackJsonp(["styles"],{

/***/ "../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.eot":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "font_zck90zmlh7hf47vi.f818dd2cff476462d671.eot";

/***/ }),

/***/ "../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.svg":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "font_zck90zmlh7hf47vi.791eab75ad933e3c7830.svg";

/***/ }),

/***/ "../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.ttf":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "font_zck90zmlh7hf47vi.0233526de0625e66d08a.ttf";

/***/ }),

/***/ "../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.woff":
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__.p + "font_zck90zmlh7hf47vi.7eb99102ef59b2a7bdfe.woff";

/***/ }),

/***/ "../../../../../faceDetect/src/styles.less":
/***/ (function(module, exports, __webpack_require__) {

// style-loader: Adds some css to the DOM by adding a <style> tag

// load the styles
var content = __webpack_require__("../../../../css-loader/index.js?{\"sourceMap\":false,\"importLoaders\":1}!../../../../postcss-loader/index.js?{\"ident\":\"postcss\"}!../../../../less-loader/dist/cjs.js?{\"sourceMap\":false}!../../../../../faceDetect/src/styles.less");
if(typeof content === 'string') content = [[module.i, content, '']];
// add the styles to the DOM
var update = __webpack_require__("../../../../style-loader/addStyles.js")(content, {});
if(content.locals) module.exports = content.locals;
// Hot Module Replacement
if(false) {
	// When the styles change, update the <style> tags
	if(!content.locals) {
		module.hot.accept("!!../../node_modules/css-loader/index.js??ref--9-1!../../node_modules/postcss-loader/index.js??postcss!../../node_modules/less-loader/dist/cjs.js??ref--9-3!./styles.less", function() {
			var newContent = require("!!../../node_modules/css-loader/index.js??ref--9-1!../../node_modules/postcss-loader/index.js??postcss!../../node_modules/less-loader/dist/cjs.js??ref--9-3!./styles.less");
			if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
			update(newContent);
		});
	}
	// When the module is disposed, remove the <style> tags
	module.hot.dispose(function() { update(); });
}

/***/ }),

/***/ "../../../../css-loader/index.js?{\"sourceMap\":false,\"importLoaders\":1}!../../../../postcss-loader/index.js?{\"ident\":\"postcss\"}!../../../../less-loader/dist/cjs.js?{\"sourceMap\":false}!../../../../../faceDetect/src/styles.less":
/***/ (function(module, exports, __webpack_require__) {

exports = module.exports = __webpack_require__("../../../../css-loader/lib/css-base.js")(false);
// imports


// module
exports.push([module.i, "/* You can add global styles to this file, and also import other style files */\n@font-face {\n  font-family: 'anticon';\n  src: url(" + __webpack_require__("../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.eot") + ");\n  src: url(" + __webpack_require__("../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.eot") + ") format('embedded-opentype'), url(" + __webpack_require__("../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.woff") + ") format('woff'), url(" + __webpack_require__("../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.ttf") + ") format('truetype'), url(" + __webpack_require__("../../../../../faceDetect/src/font/font_zck90zmlh7hf47vi.svg") + ") format('svg');\n}\nhtml {\n  width: 50%;\n  height: 100%;\n}\n::-webkit-scrollbar-track-piece {\n  width: 10px;\n  background-color: #f2f2f2;\n}\n::-webkit-scrollbar {\n  width: 10px;\n  height: 6px ;\n}\n::-webkit-scrollbar-thumb {\n  height: 50px;\n  background: #bfbfbf;\n  cursor: pointer;\n}\n::-webkit-scrollbar-thumb:hover {\n  background: #bfbfbf;\n  cursor: pointer;\n}\n.top-bar {\n  position: absolute;\n  width: 100%;\n  left: 0;\n  top: 0;\n  height: 70px;\n  z-index: 100;\n}\n.top-bar .logo {\n  float: left;\n  width: 170px;\n  height: 70px;\n}\n.top-bar .logo img {\n  width: 170px;\n  height: 60px;\n  margin-top: 5px;\n}\n.top-bar .top-menu {\n  float: left;\n}\n.top-bar ul.top-menu > li {\n  display: inline-block;\n  width: 120px;\n  height: 70px;\n  text-align: center;\n}\n.top-bar ul.top-menu > li > a {\n  color: black;\n  font-size: 14px;\n  display: block;\n  height: 100%;\n  line-height: 70px;\n}\n.top-bar ul.top-menu > li > a:active,\n.top-bar ul.top-menu > li > a:hover {\n  color: #dab968;\n}\n.layout-main {\n  width: 100%;\n  height: 100%;\n}\n.layout-left-menu {\n  width: 170px;\n  position: absolute;\n  left: 0;\n  height: 100%;\n}\n.layout-wrapper {\n  width: 100%;\n  height: 100%;\n  overflow-y: scroll;\n  padding-bottom: 50px;\n}\n.layout-content {\n  margin-left: 170px;\n  height: 100%;\n}\n.layout-footer {\n  position: absolute;\n  z-index: 5;\n  left: 0;\n  bottom: 0;\n  width: 100%;\n  height: 50px;\n  padding-left: 170px;\n}\n.text-center {\n  text-align: center;\n}\n.pp-table {\n  position: relative;\n  top: 50px;\n  border-radius: 3px;\n  border: 1px solid #ccc;\n  padding: 10px;\n  width: 1200px;\n  margin: 0 auto;\n}\n.pp-table .ant-btn-group > .ant-btn {\n  background: #e5e5e5 !important;\n}\n.pp-table .ant-pagination .ant-pagination-item-active {\n  background: #e5e5e5;\n}\n.pp-table .ant-pagination .ant-pagination-item-active a {\n  color: #666;\n}\n.pp-table .ant-spin-container table {\n  border: 1px solid #ccc;\n  color: #050505;\n  font-size: 14px;\n  border-collapse: collapse;\n  overflow: auto;\n}\n.pp-table .ant-spin-container table tr:nth-of-type(even) {\n  background: #f7f7f7;\n}\n.pp-table .ant-spin-container table th {\n  background: #e5e5e5;\n}\n.pp-table .ant-spin-container table td span {\n  color: #666;\n}\n.pp-table .ant-spin-container table td,\n.pp-table .ant-spin-container table th {\n  box-sizing: border-box;\n  border-radius: 0;\n  border: 1px solid #ccc;\n  size: 16px;\n  padding: 10px 8px;\n  border-right: 0;\n}\n.pp-table .ant-spin-container table td span,\n.pp-table .ant-spin-container table th span {\n  font-size: 13px !important;\n}\n.pp-table .ant-spin-container table td img,\n.pp-table .ant-spin-container table th img {\n  width: 50px;\n  height: 50px;\n}\n.pp-table .ant-spin-container table tr td:first-child {\n  border-left: 0;\n}\n.pp-table .ant-spin-container table .action button {\n  background: #e5e5e5 !important;\n  border: 2px solid #e5e5e5;\n}\n.pp-table .pp-table-info {\n  position: absolute;\n  bottom: 25px;\n  left: 10px;\n  font-size: 14px;\n}\n/**人脸库管理/地图管理默认样式 */\n.ant-modal {\n  /**min-width:620px;**/\n  /**\n   checked-box的样式\n  */\n}\n.ant-modal .ant-checkbox-wrapper {\n  margin: 5px 0;\n}\n.ant-modal .ant-checkbox-wrapper + .ant-checkbox-wrapper {\n  margin-left: 0;\n}\n.ant-modal .ant-checkbox-wrapper + span,\n.ant-modal .ant-checkbox + span {\n  padding-left: 0;\n  padding-right: 16px;\n  display: inline-block;\n}\n/**地图管理model 样式*/\n.map-model .ant-modal {\n  width: 1200px !important;\n}\n.ant-modal-footer {\n  display: none;\n}\n.ant-form-horizontal .ant-btn {\n  margin: 0 15px;\n}\n/**\n  布控策略界面摄像头选择model\n */\n.camera-select-model {\n  position: relative;\n  z-index: 2000;\n}\n.camera-select-model .ant-modal-footer {\n  display: block;\n}\n/**\n  布控策略界面周期选择model\n */\n.week-select-model {\n  position: relative;\n  z-index: 2000;\n}\n.week-select-model .ant-modal-footer {\n  display: block;\n}\n/**\n  摄像头管理界面modal\n */\n.camera-modal-container .ant-modal {\n  min-width: 1000px !important;\n  top: 20px;\n}\n/**\n  识别管理界面modal 告警查询\n */\n.recognize-modal-container .ant-modal {\n  min-width: 1000px !important;\n}\n.recognize-modal-container .ant-modal-body {\n  overflow: hidden;\n}\n.recognize-modal-container .left-content > dl {\n  float: left;\n  width: 50%;\n  margin: 15px 0;\n  padding: 0 8px;\n}\n.recognize-modal-container .left-content > dl dd {\n  font-size: 16px;\n  text-align: center;\n}\n.recognize-modal-container .left-content > dl dt .ngxcarousel > .ngxcarousel-inner > .ngxcarousel-items > .item {\n  text-align: center !important;\n}\n.recognize-modal-container .left-content > dl img {\n  width: 100%;\n  height: 230px;\n}\n.recognize-modal-container .left-content > dl .video-js {\n  width: 100%;\n  height: 220px;\n}\n.recognize-modal-container .left-content > dl .video-js .vjs-big-play-button {\n  left: 50%;\n  top: 50%;\n  -webkit-transform: translate(-50%, -50%);\n          transform: translate(-50%, -50%);\n}\n.recognize-modal-container .right-content {\n  margin: 20px 0;\n}\n/**\n  抓拍管理界面modal 抓拍查询\n */\n.snapshot-modal-container .ant-modal {\n  min-width: 800px !important;\n}\n.snapshot-modal-container .ant-modal-body {\n  overflow: hidden;\n}\n.snapshot-modal-container .left-content > dl {\n  float: left;\n  width: 80%;\n  margin: 15px 40px;\n  padding: 0 8px;\n}\n.snapshot-modal-container .left-content > dl dd {\n  font-size: 16px;\n  text-align: center;\n}\n.snapshot-modal-container .left-content > dl img {\n  height: 350px;\n  width: 100%;\n}\n.snapshot-modal-container .right-content > dl {\n  width: 80%;\n  margin: 15px 40px;\n  padding: 0 8px;\n}\n.snapshot-modal-container .right-content > dl dd {\n  font-size: 16px;\n  text-align: center;\n}\n.snapshot-modal-container .right-content > dl img {\n  height: 350px;\n  width: 100%;\n}\n/**\n  注册管理界面modal\n */\n.register-modal-container .ant-modal {\n  min-width: 1200px !important;\n}\n.register-modal-container .ant-modal .ant-modal-body {\n  padding-top: 0 !important;\n  padding-bottom: 0 !important;\n}\n.register-modal-container .ant-modal .ant-modal-body form .register-row {\n  margin-bottom: 0;\n}\n.register-modal-container .ant-modal .ant-modal-body form .register-col {\n  padding-top: 20px !important;\n  padding-bottom: 20px !important;\n}\n.register-modal-container .ant-modal .ant-modal-body form .register-modal-footer {\n  bottom: -10px !important;\n  position: absolute;\n  width: 100%;\n}\n/**\n   布控策略管理界面model\n */\n.strategy-modal-container .ant-modal {\n  min-width: 900px !important;\n}\n.strategy-modal-container .ant-modal .ant-modal-body {\n  padding: 0;\n}\n.strategy-modal-container .ant-modal .strategy-modal-content {\n  -webkit-column-width: 900px;\n          column-width: 900px;\n  min-height: 600px;\n  -webkit-column-count: 2;\n          column-count: 2;\n  overflow: hidden;\n}\n.strategy-modal-container .ant-modal .this-system,\n.strategy-modal-container .ant-modal .select-device {\n  position: relative;\n  box-sizing: border-box;\n  width: 50%;\n  min-height: 600px;\n  float: left;\n}\n.strategy-modal-container .ant-modal .this-system .ant-modal .ant-checkbox-wrapper,\n.strategy-modal-container .ant-modal .select-device .ant-modal .ant-checkbox-wrapper {\n  margin: 3px 0;\n}\n.strategy-modal-container .ant-modal .this-system .form-mark-layer,\n.strategy-modal-container .ant-modal .select-device .form-mark-layer {\n  display: none;\n  position: absolute;\n  background: #e8e8e8;\n  opacity: 0.5;\n  z-index: 100;\n  width: 100%;\n  height: 100%;\n}\n.strategy-modal-container .ant-modal .this-system h2,\n.strategy-modal-container .ant-modal .select-device h2 {\n  width: 100%;\n  text-align: center;\n  margin-bottom: 20px;\n  margin-top: 20px;\n}\n.strategy-modal-container .ant-modal .this-system:first-child,\n.strategy-modal-container .ant-modal .select-device:first-child {\n  border-right: 1px solid #e8e8e8;\n}\n.search-container nz-input[_ngcontent-c5] {\n  margin-right: 60px !important;\n}\n.search-container label {\n  font-size: 13px;\n  margin-right: 5px;\n}\n.search-container button {\n  background: #e5e5e5 !important;\n}\n.pp-table .ng-star-inserted .ant-switch-checked {\n  background: #6FEC6F !important;\n}\n.pp-table .ng-star-inserted span[checked] {\n  color: #666;\n}\n.pp-table .ng-star-inserted span[unchecked] {\n  color: #666;\n}\n.toop-tip.valid-error {\n  color: #f65257;\n  opacity: 1;\n  z-index: 999;\n  position: absolute;\n  top: 100%;\n  left: 50%;\n  padding: 5px 8px 5px 30px;\n  line-height: 18px;\n  border-radius: 3px;\n  background-color: #fff;\n  background-size: 14px;\n  font-size: 10px;\n  box-shadow: 0 1px 25px #aaa;\n  white-space: nowrap;\n  transition: all 0.3s;\n  background-repeat: no-repeat;\n  background-image: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABMAAAATCAIAAAGKNZENAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo1QTMzRjg3REEyNjkxMUU2QjI1NTkzRTQwMDU4MUQ4QyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo1QTMzRjg3RUEyNjkxMUU2QjI1NTkzRTQwMDU4MUQ4QyI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjVBMzNGODdCQTI2OTExRTZCMjU1OTNFNDAwNTgxRDhDIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjVBMzNGODdDQTI2OTExRTZCMjU1OTNFNDAwNTgxRDhDIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+9o3G7wAAAONJREFUeNpi/PvsyJ+jsQxA8HO14v///4EkE5Dza40SkAQIIEYgD0iBBBAUQABBBdlC7kEUQYXhACCAoPIQwGK9GCoPVA8kgXahq8fBhxgOBAABhGIeJkDRDrQEYg/CAcicH02MIB1aitilOer+I1sMshsRPBgA6DWAAGL8udmO4cdjLJIcskzYJUCueIzuZnzBQZYcxKPY5SC+JN1M5HABy7FLY9fFIQcQYLjDBT/AF2r4wY/HLLik4OGL5gGiQgA/IF8nTtficiRhnQT9iVMnPLUg5wxUnRyyWCMGlwYoYJcGAEIlTCpoJKVIAAAAAElFTkSuQmCC);\n  background-position: 10px;\n  -webkit-transform: translate(-50%, 7px);\n          transform: translate(-50%, 7px);\n}\n.toop-tip.valid-error:before {\n  content: '';\n  position: absolute;\n  left: 50%;\n  -webkit-transform: translate(-50%);\n          transform: translate(-50%);\n  top: -16px;\n  bottom: auto;\n  border: 8px solid #000;\n  border-color: transparent transparent #fff;\n}\n.valid-success {\n  display: none;\n}\n.ant-spin {\n  color: #666 !important;\n}\n.ant-spin-nested-loading > div > .ant-spin {\n  max-height: inherit !important;\n}\n.ant-spin-dot i {\n  background-color: #666 !important;\n}\n.ant-upload.ant-upload-drag p.ant-upload-drag-icon .anticon {\n  color: #ccc !important;\n}\n", ""]);

// exports


/***/ }),

/***/ "../../../../css-loader/lib/css-base.js":
/***/ (function(module, exports) {

/*
	MIT License http://www.opensource.org/licenses/mit-license.php
	Author Tobias Koppers @sokra
*/
// css base code, injected by the css-loader
module.exports = function(useSourceMap) {
	var list = [];

	// return the list of modules as css string
	list.toString = function toString() {
		return this.map(function (item) {
			var content = cssWithMappingToString(item, useSourceMap);
			if(item[2]) {
				return "@media " + item[2] + "{" + content + "}";
			} else {
				return content;
			}
		}).join("");
	};

	// import a list of modules into the list
	list.i = function(modules, mediaQuery) {
		if(typeof modules === "string")
			modules = [[null, modules, ""]];
		var alreadyImportedModules = {};
		for(var i = 0; i < this.length; i++) {
			var id = this[i][0];
			if(typeof id === "number")
				alreadyImportedModules[id] = true;
		}
		for(i = 0; i < modules.length; i++) {
			var item = modules[i];
			// skip already imported module
			// this implementation is not 100% perfect for weird media query combinations
			//  when a module is imported multiple times with different media queries.
			//  I hope this will never occur (Hey this way we have smaller bundles)
			if(typeof item[0] !== "number" || !alreadyImportedModules[item[0]]) {
				if(mediaQuery && !item[2]) {
					item[2] = mediaQuery;
				} else if(mediaQuery) {
					item[2] = "(" + item[2] + ") and (" + mediaQuery + ")";
				}
				list.push(item);
			}
		}
	};
	return list;
};

function cssWithMappingToString(item, useSourceMap) {
	var content = item[1] || '';
	var cssMapping = item[3];
	if (!cssMapping) {
		return content;
	}

	if (useSourceMap && typeof btoa === 'function') {
		var sourceMapping = toComment(cssMapping);
		var sourceURLs = cssMapping.sources.map(function (source) {
			return '/*# sourceURL=' + cssMapping.sourceRoot + source + ' */'
		});

		return [content].concat(sourceURLs).concat([sourceMapping]).join('\n');
	}

	return [content].join('\n');
}

// Adapted from convert-source-map (MIT)
function toComment(sourceMap) {
	// eslint-disable-next-line no-undef
	var base64 = btoa(unescape(encodeURIComponent(JSON.stringify(sourceMap))));
	var data = 'sourceMappingURL=data:application/json;charset=utf-8;base64,' + base64;

	return '/*# ' + data + ' */';
}


/***/ }),

/***/ "../../../../style-loader/addStyles.js":
/***/ (function(module, exports) {

/*
	MIT License http://www.opensource.org/licenses/mit-license.php
	Author Tobias Koppers @sokra
*/
var stylesInDom = {},
	memoize = function(fn) {
		var memo;
		return function () {
			if (typeof memo === "undefined") memo = fn.apply(this, arguments);
			return memo;
		};
	},
	isOldIE = memoize(function() {
		return /msie [6-9]\b/.test(self.navigator.userAgent.toLowerCase());
	}),
	getHeadElement = memoize(function () {
		return document.head || document.getElementsByTagName("head")[0];
	}),
	singletonElement = null,
	singletonCounter = 0,
	styleElementsInsertedAtTop = [];

module.exports = function(list, options) {
	if(typeof DEBUG !== "undefined" && DEBUG) {
		if(typeof document !== "object") throw new Error("The style-loader cannot be used in a non-browser environment");
	}

	options = options || {};
	// Force single-tag solution on IE6-9, which has a hard limit on the # of <style>
	// tags it will allow on a page
	if (typeof options.singleton === "undefined") options.singleton = isOldIE();

	// By default, add <style> tags to the bottom of <head>.
	if (typeof options.insertAt === "undefined") options.insertAt = "bottom";

	var styles = listToStyles(list);
	addStylesToDom(styles, options);

	return function update(newList) {
		var mayRemove = [];
		for(var i = 0; i < styles.length; i++) {
			var item = styles[i];
			var domStyle = stylesInDom[item.id];
			domStyle.refs--;
			mayRemove.push(domStyle);
		}
		if(newList) {
			var newStyles = listToStyles(newList);
			addStylesToDom(newStyles, options);
		}
		for(var i = 0; i < mayRemove.length; i++) {
			var domStyle = mayRemove[i];
			if(domStyle.refs === 0) {
				for(var j = 0; j < domStyle.parts.length; j++)
					domStyle.parts[j]();
				delete stylesInDom[domStyle.id];
			}
		}
	};
}

function addStylesToDom(styles, options) {
	for(var i = 0; i < styles.length; i++) {
		var item = styles[i];
		var domStyle = stylesInDom[item.id];
		if(domStyle) {
			domStyle.refs++;
			for(var j = 0; j < domStyle.parts.length; j++) {
				domStyle.parts[j](item.parts[j]);
			}
			for(; j < item.parts.length; j++) {
				domStyle.parts.push(addStyle(item.parts[j], options));
			}
		} else {
			var parts = [];
			for(var j = 0; j < item.parts.length; j++) {
				parts.push(addStyle(item.parts[j], options));
			}
			stylesInDom[item.id] = {id: item.id, refs: 1, parts: parts};
		}
	}
}

function listToStyles(list) {
	var styles = [];
	var newStyles = {};
	for(var i = 0; i < list.length; i++) {
		var item = list[i];
		var id = item[0];
		var css = item[1];
		var media = item[2];
		var sourceMap = item[3];
		var part = {css: css, media: media, sourceMap: sourceMap};
		if(!newStyles[id])
			styles.push(newStyles[id] = {id: id, parts: [part]});
		else
			newStyles[id].parts.push(part);
	}
	return styles;
}

function insertStyleElement(options, styleElement) {
	var head = getHeadElement();
	var lastStyleElementInsertedAtTop = styleElementsInsertedAtTop[styleElementsInsertedAtTop.length - 1];
	if (options.insertAt === "top") {
		if(!lastStyleElementInsertedAtTop) {
			head.insertBefore(styleElement, head.firstChild);
		} else if(lastStyleElementInsertedAtTop.nextSibling) {
			head.insertBefore(styleElement, lastStyleElementInsertedAtTop.nextSibling);
		} else {
			head.appendChild(styleElement);
		}
		styleElementsInsertedAtTop.push(styleElement);
	} else if (options.insertAt === "bottom") {
		head.appendChild(styleElement);
	} else {
		throw new Error("Invalid value for parameter 'insertAt'. Must be 'top' or 'bottom'.");
	}
}

function removeStyleElement(styleElement) {
	styleElement.parentNode.removeChild(styleElement);
	var idx = styleElementsInsertedAtTop.indexOf(styleElement);
	if(idx >= 0) {
		styleElementsInsertedAtTop.splice(idx, 1);
	}
}

function createStyleElement(options) {
	var styleElement = document.createElement("style");
	styleElement.type = "text/css";
	insertStyleElement(options, styleElement);
	return styleElement;
}

function createLinkElement(options) {
	var linkElement = document.createElement("link");
	linkElement.rel = "stylesheet";
	insertStyleElement(options, linkElement);
	return linkElement;
}

function addStyle(obj, options) {
	var styleElement, update, remove;

	if (options.singleton) {
		var styleIndex = singletonCounter++;
		styleElement = singletonElement || (singletonElement = createStyleElement(options));
		update = applyToSingletonTag.bind(null, styleElement, styleIndex, false);
		remove = applyToSingletonTag.bind(null, styleElement, styleIndex, true);
	} else if(obj.sourceMap &&
		typeof URL === "function" &&
		typeof URL.createObjectURL === "function" &&
		typeof URL.revokeObjectURL === "function" &&
		typeof Blob === "function" &&
		typeof btoa === "function") {
		styleElement = createLinkElement(options);
		update = updateLink.bind(null, styleElement);
		remove = function() {
			removeStyleElement(styleElement);
			if(styleElement.href)
				URL.revokeObjectURL(styleElement.href);
		};
	} else {
		styleElement = createStyleElement(options);
		update = applyToTag.bind(null, styleElement);
		remove = function() {
			removeStyleElement(styleElement);
		};
	}

	update(obj);

	return function updateStyle(newObj) {
		if(newObj) {
			if(newObj.css === obj.css && newObj.media === obj.media && newObj.sourceMap === obj.sourceMap)
				return;
			update(obj = newObj);
		} else {
			remove();
		}
	};
}

var replaceText = (function () {
	var textStore = [];

	return function (index, replacement) {
		textStore[index] = replacement;
		return textStore.filter(Boolean).join('\n');
	};
})();

function applyToSingletonTag(styleElement, index, remove, obj) {
	var css = remove ? "" : obj.css;

	if (styleElement.styleSheet) {
		styleElement.styleSheet.cssText = replaceText(index, css);
	} else {
		var cssNode = document.createTextNode(css);
		var childNodes = styleElement.childNodes;
		if (childNodes[index]) styleElement.removeChild(childNodes[index]);
		if (childNodes.length) {
			styleElement.insertBefore(cssNode, childNodes[index]);
		} else {
			styleElement.appendChild(cssNode);
		}
	}
}

function applyToTag(styleElement, obj) {
	var css = obj.css;
	var media = obj.media;

	if(media) {
		styleElement.setAttribute("media", media)
	}

	if(styleElement.styleSheet) {
		styleElement.styleSheet.cssText = css;
	} else {
		while(styleElement.firstChild) {
			styleElement.removeChild(styleElement.firstChild);
		}
		styleElement.appendChild(document.createTextNode(css));
	}
}

function updateLink(linkElement, obj) {
	var css = obj.css;
	var sourceMap = obj.sourceMap;

	if(sourceMap) {
		// http://stackoverflow.com/a/26603875
		css += "\n/*# sourceMappingURL=data:application/json;base64," + btoa(unescape(encodeURIComponent(JSON.stringify(sourceMap)))) + " */";
	}

	var blob = new Blob([css], { type: "text/css" });

	var oldSrc = linkElement.href;

	linkElement.href = URL.createObjectURL(blob);

	if(oldSrc)
		URL.revokeObjectURL(oldSrc);
}


/***/ }),

/***/ 2:
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__("../../../../../faceDetect/src/styles.less");


/***/ })

},[2]);
//# sourceMappingURL=styles.bundle.js.map