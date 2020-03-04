//1. Count the number of elements in the list which satisfy a predicate.
df.select(count("Sales")).show()

//2. Returns the last element of this list.
df.select(last("Sales")).show()

//3. returns inverse cosine of columnName, as if computed by java.lang.Math.acos
df.select(acos("Sales")).show()

//4. Returns the first column that is not null, or null if all inputs are null.
df.select(col("Sales")).show()

//5. Returns a Column based on the given column name. Alias of col.
df.select(column("Sales")).show()

//6. Creates a Column of literal value.
df.select(lit("Sales")).show()

//7. Creates a new struct column that composes multiple input columns.
df.select(struct("Sales")).show()

//8. Creates a Column of literal value.
df.select(typedLit("Sales")).show()

//9. Computes the cube-root of the given value
df.select(cbrt("Sales")).show()

//10. Computes the ceiling of the given value.
df.select(ceil("Sales")).show()

//11. Returns a Column based on the given column name.
df.select(collect_list("Sales")).show()

//12. Aggregate function: returns a list of objects with duplicates.
df.select(collect_list("Sales")).show()

//13. Aggregate function: returns a set of objects with duplicate elements eliminated.
df.select(collect_set("Sales")).show()

//14. Aggregate function: returns the number of items in a group.
df.select(count("Sales")).show()

//15. Aggregate function: returns the number of distinct items in a group.
df.select(countDistinct("Sales")).show()
