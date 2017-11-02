/**
 * Created by WolfgangW on 10/30/17.
 */
require(
    ["dojo/parser", "dojo/_base/declare", "dijit/_WidgetBase", "dijit/_Container",
        "dijit/form/Button",
        'dijit/form/TextBox',
        'dijit/form/ComboBox',
        'dijit/form/CheckBox',
        'dijit/form/DateTextBox',
        'dijit/form/TimeTextBox',
        'dojo/store/Memory',
        'dojo/request',
        'dojo/dom-form',
        'gridx/Grid',
        'dojo/date/locale',
        'gridx/allModules',
        "dojo/domReady!"],
    function (parser, declare, _WidgetBase, _Container, Button, TextBox,
              ComboBox, CheckBox, DateTextBox, TimeTextBox, MemoryStore, request, form, Grid, locale) {

        fmto = "EEEE, MMMM d yyyy GGG, h:m:s.SSS a z (ZZZZ)";
        fmts = {
            explicit: fmto,
            usDate: "MM/dd/yyyy",
            usEditableDatetime: "MM/dd/yyyy h:m:s",
            usDatetime: "MM/dd/yyyy h:m:s.SSS",
            usDefaultDate: "yyyy-MM-dd",//Jun 12 2014 10:55:33:496PM
            usDefaultDatetime: "yyyy-MM-dd HH:mm:ss",//Jun 12 2014 10:55:33:496PM
            simple: "MMM d, yyyy",
            abbreviated: "EEE, MMM d, yyyy G",
            full: "MMMM d, 'in the year' yyyy GGGG",
            time: "h:m:s.SSS a z",
            ordinal: "'day' D, 'week' w, 'quarter' q 'of the year' yyyy",
            literal: "'this is not really a date'",
            "extra stuff": "MMM d, yyyy -- 39:45, ____+1"
        };
        parseDate = function (d) {
            if (d == null || d == '' || d == undefined) {
                return '';
            }
            var date = null;

            try {
                date = new Date(d);
            } catch (e) {
                date = d;
            }
        }
        parseDatetime = function (d) {
            if (d == null || d == '' || d == undefined) {
                return '';
            }
        }





        _getDateStrFromDBDateStr = function (d, pattern, pat) {
            console.log("abcdefg");
            if (d == null || d == '' || d == undefined) {
                return '';
            }
            var dbPat = arguments.length > 2 ? pat : fmts.usDefaultDatetime;
            /*if(d&&d.length>dbPat.length){
             d = d.substr(0,dbPat.length);
             }*/
            if (d.length > dbPat.length) {
                d = d.substr(0, dbPat.length);
            } else if (d.length < dbPat.length) {
                dbPat = dbPat.substr(0, d.length);
            }
            var date = locale.parse(d, {
                selector: 'date',
                datePattern: dbPat
            });
            if (pattern == undefined) {
                pattern = 'MM/dd/yyyy';
            }
            var res = locale.format(date, {
                selector: 'date',
                datePattern: pattern
            });
            //console.log(res);
            return res;
        }
        /**
         * it's to get date time to compatible normal date time pattern
         */
        _getDatetime = function (dataType, dateStr) {
            //console.log('getDatetime');
            //console.log(dateStr);
            var pattern = fmts.usDate;
            if (dataType == 'datetime' || dataType == 'timestamp') {
                if (dateStr.indexOf('-') > 0) {
                    pattern = fmts.usDefaultDatetime;
                }
            } else if (dataType == 'date') {
                if (dateStr.indexOf('-') > 0) {
                    pattern = fmts.usDefaultDate;
                }
            }
            //console.log(pattern);
            //console.log('parseDate(dateStr,pattern)');
            //console.log(parseDate(dateStr,pattern));
            var d = parseDate(dateStr, pattern);
            return d;
        }
        /**
         * it's to set date string to widget
         */
        _setDateTime = function (wid, dataType, dateStr) {
            //console.log('###################setDateTime setDateTime setDateTime setDateTime');
            //console.log(dataType);
            //console.log(dateStr);
            dijit.byId(wid).set('useCurrentTime', false);
            if (dateStr) {
                var date = getDatetime(dataType, dateStr);
                dijit.byId(wid).set('value', date);
            } else {
                dijit.byId(wid).set('value', null);
            }
        };
        _parseDate = function (str, pattern) {
            //console.log('parseDateparseDate=================');
            var pat = arguments.length > 1 ? pattern : fmts.usDefaultDatetime;
            //console.log(pat);
            if (str && str.length > pat.length) {
                str = str.substr(0, pat.length);
            }
            //console.log(str);
            var date = locale.parse(str, {
                selector: 'date',
                datePattern: pat
            });
            //console.log(date);
            return date;
        }
    }
)