package com.example.expensetracker.ui.stats

import android.view.LayoutInflater
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.expensetracker.R
import com.example.expensetracker.viewmodel.StatsViewModel
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

@Composable
fun StatsScreen(viewModel: StatsViewModel) {

    val expenseList by viewModel.expensesByDate.collectAsState(initial = emptyList())
    val (entries, labels) = viewModel.getEntriesForChart(expenseList)

    val context = LocalContext.current

    AndroidView(
        modifier = Modifier
            .fillMaxWidth()
            .height(280.dp),
        factory = {
            LayoutInflater.from(context).inflate(R.layout.stats_line_chart, null)
        },
        update = { view ->
            val chart = view.findViewById<LineChart>(R.id.lineChart)

            val dataSet = LineDataSet(entries, "Expenses")
            dataSet.color = android.graphics.Color.parseColor("#2F7E79")
            dataSet.setDrawFilled(true)
            dataSet.valueTextColor = android.graphics.Color.BLACK

            chart.data = LineData(dataSet)
            chart.invalidate()
        }
    )
}
