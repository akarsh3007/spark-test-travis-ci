import com.github.mrpowers.spark.fast.tests.DatasetComparer
import org.scalatest.FunSpec

class SparkTest extends FunSpec with SparkSessionTestWrapper with DatasetComparer {

  import spark.implicits._

  it("aliases a DataFrame") {

    val sourceDF = Seq(
      ("jose"),
      ("li"),
      ("luisa")
    ).toDF("name")

    val actualDF = sourceDF.select(sourceDF("name").alias("student"))

    val expectedDF = Seq(
      ("jose"),
      ("li"),
      ("luisa")
    ).toDF("student")

    assertSmallDatasetEquality(actualDF, expectedDF)

  }

}
