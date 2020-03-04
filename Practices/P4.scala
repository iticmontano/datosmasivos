//1. Returns a sort expression based on ascending order of the column.
df.sort(asc("Sales"), desc("Company")).show()

//2. Returns a sort expression based on the descending order of the column, and null values appear after non-null values.
df.sort(asc("Company"), desc_nulls_last("Sales")).show()

// 3. Aggregate function: returns the approximate number of distinct items in a group.
df.agg(approx_count_distinct("Sales")).show()

//5. Aggregate function: returns the kurtosis of the values in a group.
df.select(kurtosis("Sales")).show()

//6. Aggregate function: returns the last value of the column in a group.
df.select(last("Sales")).show()

//7. Aggregate function: returns the average of the values in a group.
df.select(mean("Sales")).show()

//8. Aggregate function: returns the skewness of the values in a group.
df.select(skewness("Sales")).show()

//9. Aggregate function: alias for stddev_samp.
df.select(stddev("Sales")).show()

//10. Aggregate function: returns the population standard deviation of the expression in a group.
df.select(stddev_pop("Sales")).show()

//11. Aggregate function: returns the sample standard deviation of the expression in a group.
df.select(stddev_samp("Sales")).show()

//12. Aggregate function: returns the population variance of the values in a group.
df.select(var_pop("Sales")).show()

//13. Aggregate function: returns the unbiased variance of the values in a group.
df.select(var_samp("Sales")).show()

//14. Aggregate function: alias for var_samp.
df.select(variance("Sales")).show()

//15. Aggregate function: returns the average of the values in a group.
df.select(avg("Sales")).show()

//16. Aggregate function: returns the number of items in a group.
df.select(count("Sales")).show()

//17. Aggregate function: returns the population covariance for two columns.
df.select(covar_pop("Sales")).show()

//18. Aggregate function: returns the first value of a column in a group
df.select(first("Sales")).show()

//19. Aggregate function: indicates whether a specified column in a GROUP BY list is aggregated or not, returns 1 for aggregated or 0 for not aggregated in the result set
df.select(grouping("Sales")).show()

//20. Aggregate function: returns the maximum value of the column in a group.
df.select(max("Sales")).show()
