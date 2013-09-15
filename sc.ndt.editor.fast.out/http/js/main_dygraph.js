// define globals
//n1 = new Array();
//n2 = new Array();

$(document).ready(function () {
    g1 = new Dygraph(
        document.getElementById("noroll"),
        data_temp,
        {
          customBars: true,
          title: 'Daily Temperatures in New York vs. San Francisco',
          ylabel: 'Temperature (F)',
          legend: 'always',
          labelsDivStyles: { 'textAlign': 'right' },
          showRangeSelector: true
        }
    );
    g2 = new Dygraph(
        document.getElementById("roll14"),
        data_temp,
        {
          rollPeriod: 14,
          showRoller: true,
          customBars: true,
          title: 'Daily Temperatures in New York vs. San Francisco',
          ylabel: 'Temperature (F)',
          legend: 'always',
          labelsDivStyles: { 'textAlign': 'right' },
          showRangeSelector: true,
          rangeSelectorHeight: 30,
          rangeSelectorPlotStrokeColor: 'yellow',
          rangeSelectorPlotFillColor: 'lightyellow'
        });
  }
);