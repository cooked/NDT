// define globals
n1 = new Array();
n2 = new Array();

$(document).ready(function() {
	
	var options1 = {
		series : {
			lines : {
				show : 		true,
				lineWidth : 1,
				fill : 		false,
				fillColor : "#f00"
			},
			shadowSize : 0
		},

		/*
		// flot-axis-labels
		xaxes : [ {
			axisLabelFontFamily: 'Courier New',
			axisLabelFontSizePixels: 10
		} ],
		yaxes : [ {
			position : 					'left',
			axisLabel : 				'Channels',
			axisLabelFontFamily: 		'Courier New',
			axisLabelFontSizePixels: 	10
		}],

		// pan, zoom
		xaxis : {
			tickDecimals : 1
		},
		yaxis : {
			tickDecimals : 1
		},*/
		grid : {
			show : true,
			color : 			"#ccc",
			backgroundColor : 	"#eee",
			borderWidth : 		1,
			borderColor : 		"#ccc",
			hoverable   : 		true
			//clickable: true
		},
		crosshair: {
			mode: "x",
			color: "rgba(0, 0, 0, 0.50)"
		}, 
		selection: {
			mode: "xy"
		}, 
		legend: {
		    show: true,
		    //labelFormatter: null or (fn: string, series object -> string)
		    //labelBoxBorderColor: color
		    noColumns: 5,
		    position: "sw" //or "nw" or "se" or "sw"
		    //margin: number of pixels or [x margin, y margin]
		    //backgroundColor: null or color
		    //backgroundOpacity: number between 0 and 1
		    //container: null or jQuery object/DOM element/jQuery expression
		    //sorted: null/false, true, "ascending", "descending", "reverse", or a comparator
		}
	};

	var options2 = {
			series : {
				lines : {
					show : 		true,
					lineWidth : 1,
					fill : 		false,
					fillColor : "#f00"
				},
				shadowSize : 0
			},

			// flot-axis-labels
			xaxes : [ {
				//axisLabel : 'foo',
				axisLabelFontFamily: 'Courier New',
				axisLabelFontSizePixels: 10
			} ],
			yaxes : [ {
				position : 'left',
				axisLabel : 'Channels',
				axisLabelFontFamily: 'Courier New',
				axisLabelFontSizePixels: 10
			}],

			// pan, zoom, etc
			yaxis : {
				tickDecimals : 1
			},
			xaxis : {
				ticks: [0.001,0.01,0.1,1,10,100],
				tickDecimals : 3,
				transform:  function(v) {
					return Math.log(v+0.0001); ///move away from zero
				}
			},
			grid : {
				show : true,
				color : "#ccc",
				backgroundColor : "#eee",
				borderWidth : 1,
				borderColor : "#ccc",
				hoverable   : true
				
			}
	};
	
	
	var placeholder1 = $('#flot1');
	var placeholder2 = $('#flot2');
		
	placeholder1.bind("plotselected", function (event, ranges) {
		//$("#selection").text(ranges.xaxis.from.toFixed(1) + " to " + ranges.xaxis.to.toFixed(1));
		//var zoom = true; // TODO $("#zoom").attr("checked");
		//if (zoom) {
			plot = $.plot(placeholder1, n1, $.extend(true, {}, options1, {
				xaxis: {
					min: ranges.xaxis.from,
					max: ranges.xaxis.to
				},
				yaxis: {
					min: ranges.yaxis.from,
					max: ranges.yaxis.to
				}
			}));
		//}
	});
	
	placeholder1.bind("plotunselected", function (event) {
		//$("#selection").text("");
	});
	
	
	// enable plot
	flot1 	= $.plot(placeholder1, n1, options1);
	//flot2 	= $.plot(placeholder2, n2, options2);

	
});

// update plot 1
function setSWTData1() {
    
    flot1.setData(n1);
    flot1.setupGrid();
    flot1.draw();
    
    return n1.length;
    
}

// update plot 2 
function setSWTData2() {
    
    flot2.setData(n2);
    flot2.setupGrid();
    flot2.draw();
    
    return n2.length;
    
}
