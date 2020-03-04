//1.- Start a simple session on spark
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

//2.- load a Netflix_2011_2016.csv file  
val df = spark.read.option("header", "true").option("inferSchema","true")csv("Netflix_2011_2016.csv")

//3.- column names
df.columns //res0: Array[String] = Array(Date, Open, High, Low, Close, Volume, Adj Close)

//4.- show the Schema
df.printSchema()

//5.- Print the first 5 columns
df.select($"Date", $"Open", $"High", $"Low", $"Close").show()

//6.- Use describe() to learn about the DataFrame
df.describe().show()

//7.- Create a new dataframe with a new column called "HV Ratio", is the 
//    relation bethween the price of the column ""high" and the column "Volume"
val df2 = df.withColumn("HV_Ratio", df("High")/df("Volume"))
df2.select("HV_Ratio").show()

//8.- What day has the high in the column "Close"?
            val day = df.withColumn("Day", dayofmonth(df("Date")))
            val day2 = day.select($"Day", $"Close").groupBy("Day").max()
            day2.select($"Day", $"max(Close)").orderBy("Day").show()
            // Dia 13

//9.- What mean the column "Close"?
//    Cierre de operaciones por año

//10.- what is the max and min of the column "Volume"?
//          MIN
df.select(max("Volume")).show()
//          MAX
df.select(max("Volume")).show()

//11.- With Scala sintaxis, answer the following:
//          a) 
            df.filter($"Close"<600).count()
//          b)
            ((df.filter($"High">500).count()*1.0)/ df.count())*100
//          c)
            df.stat.corr("High", "Volume")
//          d)
            val date = df.withColumn("Year", year(df("Date")))
            val dfmax = date.groupBy("Year").max()
            dfmax.select($"Year", $"max(High)").show()
//          e)
            val avg1 = df.withColumn("Month", month(df("Date")))
            val avg2 = avg1.select($"Month", $"Close").groupBy("Month").mean()
            avg2.select($"Month", $"avg(Close)").orderBy("Month").show()
            