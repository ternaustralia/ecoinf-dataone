//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.19 at 11:10:18 AM CST 
//


package au.org.ecoinformatics.eml.jaxb.eml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for otherUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="otherUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dimensionless"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="kelvin"/>
 *     &lt;enumeration value="coulomb"/>
 *     &lt;enumeration value="ampere"/>
 *     &lt;enumeration value="mole"/>
 *     &lt;enumeration value="candela"/>
 *     &lt;enumeration value="number"/>
 *     &lt;enumeration value="radian"/>
 *     &lt;enumeration value="degree"/>
 *     &lt;enumeration value="grad"/>
 *     &lt;enumeration value="cubicMeter"/>
 *     &lt;enumeration value="nominalMinute"/>
 *     &lt;enumeration value="nominalHour"/>
 *     &lt;enumeration value="nominalDay"/>
 *     &lt;enumeration value="nominalWeek"/>
 *     &lt;enumeration value="nominalYear"/>
 *     &lt;enumeration value="nominalLeapYear"/>
 *     &lt;enumeration value="celsius"/>
 *     &lt;enumeration value="fahrenheit"/>
 *     &lt;enumeration value="nanosecond"/>
 *     &lt;enumeration value="microsecond"/>
 *     &lt;enumeration value="millisecond"/>
 *     &lt;enumeration value="centisecond"/>
 *     &lt;enumeration value="decisecond"/>
 *     &lt;enumeration value="dekasecond"/>
 *     &lt;enumeration value="hectosecond"/>
 *     &lt;enumeration value="kilosecond"/>
 *     &lt;enumeration value="megasecond"/>
 *     &lt;enumeration value="minute"/>
 *     &lt;enumeration value="hour"/>
 *     &lt;enumeration value="kiloliter"/>
 *     &lt;enumeration value="microliter"/>
 *     &lt;enumeration value="milliliter"/>
 *     &lt;enumeration value="liter"/>
 *     &lt;enumeration value="gallon"/>
 *     &lt;enumeration value="quart"/>
 *     &lt;enumeration value="bushel"/>
 *     &lt;enumeration value="cubicInch"/>
 *     &lt;enumeration value="pint"/>
 *     &lt;enumeration value="megahertz"/>
 *     &lt;enumeration value="kilohertz"/>
 *     &lt;enumeration value="hertz"/>
 *     &lt;enumeration value="millihertz"/>
 *     &lt;enumeration value="newton"/>
 *     &lt;enumeration value="joule"/>
 *     &lt;enumeration value="calorie"/>
 *     &lt;enumeration value="britishThermalUnit"/>
 *     &lt;enumeration value="footPound"/>
 *     &lt;enumeration value="lumen"/>
 *     &lt;enumeration value="lux"/>
 *     &lt;enumeration value="becquerel"/>
 *     &lt;enumeration value="gray"/>
 *     &lt;enumeration value="sievert"/>
 *     &lt;enumeration value="katal"/>
 *     &lt;enumeration value="henry"/>
 *     &lt;enumeration value="megawatt"/>
 *     &lt;enumeration value="kilowatt"/>
 *     &lt;enumeration value="watt"/>
 *     &lt;enumeration value="milliwatt"/>
 *     &lt;enumeration value="megavolt"/>
 *     &lt;enumeration value="kilovolt"/>
 *     &lt;enumeration value="volt"/>
 *     &lt;enumeration value="millivolt"/>
 *     &lt;enumeration value="farad"/>
 *     &lt;enumeration value="ohm"/>
 *     &lt;enumeration value="ohmMeter"/>
 *     &lt;enumeration value="siemen"/>
 *     &lt;enumeration value="weber"/>
 *     &lt;enumeration value="tesla"/>
 *     &lt;enumeration value="pascal"/>
 *     &lt;enumeration value="megapascal"/>
 *     &lt;enumeration value="kilopascal"/>
 *     &lt;enumeration value="atmosphere"/>
 *     &lt;enumeration value="bar"/>
 *     &lt;enumeration value="millibar"/>
 *     &lt;enumeration value="kilogramsPerSquareMeter"/>
 *     &lt;enumeration value="gramsPerSquareMeter"/>
 *     &lt;enumeration value="milligramsPerSquareMeter"/>
 *     &lt;enumeration value="kilogramsPerHectare"/>
 *     &lt;enumeration value="tonnePerHectare"/>
 *     &lt;enumeration value="poundsPerSquareInch"/>
 *     &lt;enumeration value="kilogramPerCubicMeter"/>
 *     &lt;enumeration value="milliGramsPerMilliLiter"/>
 *     &lt;enumeration value="gramsPerLiter"/>
 *     &lt;enumeration value="milligramsPerCubicMeter"/>
 *     &lt;enumeration value="microgramsPerLiter"/>
 *     &lt;enumeration value="milligramsPerLiter"/>
 *     &lt;enumeration value="gramsPerCubicCentimeter"/>
 *     &lt;enumeration value="gramsPerMilliliter"/>
 *     &lt;enumeration value="gramsPerLiterPerDay"/>
 *     &lt;enumeration value="litersPerSecond"/>
 *     &lt;enumeration value="cubicMetersPerSecond"/>
 *     &lt;enumeration value="cubicFeetPerSecond"/>
 *     &lt;enumeration value="squareMeter"/>
 *     &lt;enumeration value="are"/>
 *     &lt;enumeration value="hectare"/>
 *     &lt;enumeration value="squareKilometers"/>
 *     &lt;enumeration value="squareMillimeters"/>
 *     &lt;enumeration value="squareCentimeters"/>
 *     &lt;enumeration value="acre"/>
 *     &lt;enumeration value="squareFoot"/>
 *     &lt;enumeration value="squareYard"/>
 *     &lt;enumeration value="squareMile"/>
 *     &lt;enumeration value="litersPerSquareMeter"/>
 *     &lt;enumeration value="bushelsPerAcre"/>
 *     &lt;enumeration value="litersPerHectare"/>
 *     &lt;enumeration value="squareMeterPerKilogram"/>
 *     &lt;enumeration value="metersPerSecond"/>
 *     &lt;enumeration value="metersPerDay"/>
 *     &lt;enumeration value="feetPerDay"/>
 *     &lt;enumeration value="feetPerSecond"/>
 *     &lt;enumeration value="feetPerHour"/>
 *     &lt;enumeration value="yardsPerSecond"/>
 *     &lt;enumeration value="milesPerHour"/>
 *     &lt;enumeration value="milesPerSecond"/>
 *     &lt;enumeration value="milesPerMinute"/>
 *     &lt;enumeration value="centimetersPerSecond"/>
 *     &lt;enumeration value="millimetersPerSecond"/>
 *     &lt;enumeration value="centimeterPerYear"/>
 *     &lt;enumeration value="knots"/>
 *     &lt;enumeration value="kilometersPerHour"/>
 *     &lt;enumeration value="metersPerSecondSquared"/>
 *     &lt;enumeration value="waveNumber"/>
 *     &lt;enumeration value="cubicMeterPerKilogram"/>
 *     &lt;enumeration value="cubicMicrometersPerGram"/>
 *     &lt;enumeration value="amperePerSquareMeter"/>
 *     &lt;enumeration value="amperePerMeter"/>
 *     &lt;enumeration value="molePerCubicMeter"/>
 *     &lt;enumeration value="molarity"/>
 *     &lt;enumeration value="molality"/>
 *     &lt;enumeration value="candelaPerSquareMeter"/>
 *     &lt;enumeration value="metersSquaredPerSecond"/>
 *     &lt;enumeration value="metersSquaredPerDay"/>
 *     &lt;enumeration value="feetSquaredPerDay"/>
 *     &lt;enumeration value="kilogramsPerMeterSquaredPerSecond"/>
 *     &lt;enumeration value="gramsPerCentimeterSquaredPerSecond"/>
 *     &lt;enumeration value="gramsPerMeterSquaredPerYear"/>
 *     &lt;enumeration value="gramsPerHectarePerDay"/>
 *     &lt;enumeration value="kilogramsPerHectarePerYear"/>
 *     &lt;enumeration value="kilogramsPerMeterSquaredPerYear"/>
 *     &lt;enumeration value="molesPerKilogram"/>
 *     &lt;enumeration value="molesPerGram"/>
 *     &lt;enumeration value="millimolesPerGram"/>
 *     &lt;enumeration value="molesPerKilogramPerSecond"/>
 *     &lt;enumeration value="nanomolesPerGramPerSecond"/>
 *     &lt;enumeration value="kilogramsPerSecond"/>
 *     &lt;enumeration value="tonnesPerYear"/>
 *     &lt;enumeration value="gramsPerYear"/>
 *     &lt;enumeration value="numberPerMeterSquared"/>
 *     &lt;enumeration value="numberPerKilometerSquared"/>
 *     &lt;enumeration value="numberPerMeterCubed"/>
 *     &lt;enumeration value="numberPerLiter"/>
 *     &lt;enumeration value="numberPerMilliliter"/>
 *     &lt;enumeration value="metersPerGram"/>
 *     &lt;enumeration value="numberPerGram"/>
 *     &lt;enumeration value="gramsPerGram"/>
 *     &lt;enumeration value="microgramsPerGram"/>
 *     &lt;enumeration value="cubicCentimetersPerCubicCentimeters"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "otherUnitType", namespace = "eml://ecoinformatics.org/units-2.1.1")
@XmlEnum
public enum OtherUnitType {

    @XmlEnumValue("dimensionless")
    DIMENSIONLESS("dimensionless"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("kelvin")
    KELVIN("kelvin"),
    @XmlEnumValue("coulomb")
    COULOMB("coulomb"),
    @XmlEnumValue("ampere")
    AMPERE("ampere"),
    @XmlEnumValue("mole")
    MOLE("mole"),
    @XmlEnumValue("candela")
    CANDELA("candela"),
    @XmlEnumValue("number")
    NUMBER("number"),
    @XmlEnumValue("radian")
    RADIAN("radian"),
    @XmlEnumValue("degree")
    DEGREE("degree"),
    @XmlEnumValue("grad")
    GRAD("grad"),
    @XmlEnumValue("cubicMeter")
    CUBIC_METER("cubicMeter"),
    @XmlEnumValue("nominalMinute")
    NOMINAL_MINUTE("nominalMinute"),
    @XmlEnumValue("nominalHour")
    NOMINAL_HOUR("nominalHour"),
    @XmlEnumValue("nominalDay")
    NOMINAL_DAY("nominalDay"),
    @XmlEnumValue("nominalWeek")
    NOMINAL_WEEK("nominalWeek"),
    @XmlEnumValue("nominalYear")
    NOMINAL_YEAR("nominalYear"),
    @XmlEnumValue("nominalLeapYear")
    NOMINAL_LEAP_YEAR("nominalLeapYear"),
    @XmlEnumValue("celsius")
    CELSIUS("celsius"),
    @XmlEnumValue("fahrenheit")
    FAHRENHEIT("fahrenheit"),
    @XmlEnumValue("nanosecond")
    NANOSECOND("nanosecond"),
    @XmlEnumValue("microsecond")
    MICROSECOND("microsecond"),
    @XmlEnumValue("millisecond")
    MILLISECOND("millisecond"),
    @XmlEnumValue("centisecond")
    CENTISECOND("centisecond"),
    @XmlEnumValue("decisecond")
    DECISECOND("decisecond"),
    @XmlEnumValue("dekasecond")
    DEKASECOND("dekasecond"),
    @XmlEnumValue("hectosecond")
    HECTOSECOND("hectosecond"),
    @XmlEnumValue("kilosecond")
    KILOSECOND("kilosecond"),
    @XmlEnumValue("megasecond")
    MEGASECOND("megasecond"),
    @XmlEnumValue("minute")
    MINUTE("minute"),
    @XmlEnumValue("hour")
    HOUR("hour"),
    @XmlEnumValue("kiloliter")
    KILOLITER("kiloliter"),
    @XmlEnumValue("microliter")
    MICROLITER("microliter"),
    @XmlEnumValue("milliliter")
    MILLILITER("milliliter"),
    @XmlEnumValue("liter")
    LITER("liter"),
    @XmlEnumValue("gallon")
    GALLON("gallon"),
    @XmlEnumValue("quart")
    QUART("quart"),
    @XmlEnumValue("bushel")
    BUSHEL("bushel"),
    @XmlEnumValue("cubicInch")
    CUBIC_INCH("cubicInch"),
    @XmlEnumValue("pint")
    PINT("pint"),
    @XmlEnumValue("megahertz")
    MEGAHERTZ("megahertz"),
    @XmlEnumValue("kilohertz")
    KILOHERTZ("kilohertz"),
    @XmlEnumValue("hertz")
    HERTZ("hertz"),
    @XmlEnumValue("millihertz")
    MILLIHERTZ("millihertz"),
    @XmlEnumValue("newton")
    NEWTON("newton"),
    @XmlEnumValue("joule")
    JOULE("joule"),
    @XmlEnumValue("calorie")
    CALORIE("calorie"),
    @XmlEnumValue("britishThermalUnit")
    BRITISH_THERMAL_UNIT("britishThermalUnit"),
    @XmlEnumValue("footPound")
    FOOT_POUND("footPound"),
    @XmlEnumValue("lumen")
    LUMEN("lumen"),
    @XmlEnumValue("lux")
    LUX("lux"),
    @XmlEnumValue("becquerel")
    BECQUEREL("becquerel"),
    @XmlEnumValue("gray")
    GRAY("gray"),
    @XmlEnumValue("sievert")
    SIEVERT("sievert"),
    @XmlEnumValue("katal")
    KATAL("katal"),
    @XmlEnumValue("henry")
    HENRY("henry"),
    @XmlEnumValue("megawatt")
    MEGAWATT("megawatt"),
    @XmlEnumValue("kilowatt")
    KILOWATT("kilowatt"),
    @XmlEnumValue("watt")
    WATT("watt"),
    @XmlEnumValue("milliwatt")
    MILLIWATT("milliwatt"),
    @XmlEnumValue("megavolt")
    MEGAVOLT("megavolt"),
    @XmlEnumValue("kilovolt")
    KILOVOLT("kilovolt"),
    @XmlEnumValue("volt")
    VOLT("volt"),
    @XmlEnumValue("millivolt")
    MILLIVOLT("millivolt"),
    @XmlEnumValue("farad")
    FARAD("farad"),
    @XmlEnumValue("ohm")
    OHM("ohm"),
    @XmlEnumValue("ohmMeter")
    OHM_METER("ohmMeter"),
    @XmlEnumValue("siemen")
    SIEMEN("siemen"),
    @XmlEnumValue("weber")
    WEBER("weber"),
    @XmlEnumValue("tesla")
    TESLA("tesla"),
    @XmlEnumValue("pascal")
    PASCAL("pascal"),
    @XmlEnumValue("megapascal")
    MEGAPASCAL("megapascal"),
    @XmlEnumValue("kilopascal")
    KILOPASCAL("kilopascal"),
    @XmlEnumValue("atmosphere")
    ATMOSPHERE("atmosphere"),
    @XmlEnumValue("bar")
    BAR("bar"),
    @XmlEnumValue("millibar")
    MILLIBAR("millibar"),
    @XmlEnumValue("kilogramsPerSquareMeter")
    KILOGRAMS_PER_SQUARE_METER("kilogramsPerSquareMeter"),
    @XmlEnumValue("gramsPerSquareMeter")
    GRAMS_PER_SQUARE_METER("gramsPerSquareMeter"),
    @XmlEnumValue("milligramsPerSquareMeter")
    MILLIGRAMS_PER_SQUARE_METER("milligramsPerSquareMeter"),
    @XmlEnumValue("kilogramsPerHectare")
    KILOGRAMS_PER_HECTARE("kilogramsPerHectare"),
    @XmlEnumValue("tonnePerHectare")
    TONNE_PER_HECTARE("tonnePerHectare"),
    @XmlEnumValue("poundsPerSquareInch")
    POUNDS_PER_SQUARE_INCH("poundsPerSquareInch"),
    @XmlEnumValue("kilogramPerCubicMeter")
    KILOGRAM_PER_CUBIC_METER("kilogramPerCubicMeter"),
    @XmlEnumValue("milliGramsPerMilliLiter")
    MILLI_GRAMS_PER_MILLI_LITER("milliGramsPerMilliLiter"),
    @XmlEnumValue("gramsPerLiter")
    GRAMS_PER_LITER("gramsPerLiter"),
    @XmlEnumValue("milligramsPerCubicMeter")
    MILLIGRAMS_PER_CUBIC_METER("milligramsPerCubicMeter"),
    @XmlEnumValue("microgramsPerLiter")
    MICROGRAMS_PER_LITER("microgramsPerLiter"),
    @XmlEnumValue("milligramsPerLiter")
    MILLIGRAMS_PER_LITER("milligramsPerLiter"),
    @XmlEnumValue("gramsPerCubicCentimeter")
    GRAMS_PER_CUBIC_CENTIMETER("gramsPerCubicCentimeter"),
    @XmlEnumValue("gramsPerMilliliter")
    GRAMS_PER_MILLILITER("gramsPerMilliliter"),
    @XmlEnumValue("gramsPerLiterPerDay")
    GRAMS_PER_LITER_PER_DAY("gramsPerLiterPerDay"),
    @XmlEnumValue("litersPerSecond")
    LITERS_PER_SECOND("litersPerSecond"),
    @XmlEnumValue("cubicMetersPerSecond")
    CUBIC_METERS_PER_SECOND("cubicMetersPerSecond"),
    @XmlEnumValue("cubicFeetPerSecond")
    CUBIC_FEET_PER_SECOND("cubicFeetPerSecond"),
    @XmlEnumValue("squareMeter")
    SQUARE_METER("squareMeter"),
    @XmlEnumValue("are")
    ARE("are"),
    @XmlEnumValue("hectare")
    HECTARE("hectare"),
    @XmlEnumValue("squareKilometers")
    SQUARE_KILOMETERS("squareKilometers"),
    @XmlEnumValue("squareMillimeters")
    SQUARE_MILLIMETERS("squareMillimeters"),
    @XmlEnumValue("squareCentimeters")
    SQUARE_CENTIMETERS("squareCentimeters"),
    @XmlEnumValue("acre")
    ACRE("acre"),
    @XmlEnumValue("squareFoot")
    SQUARE_FOOT("squareFoot"),
    @XmlEnumValue("squareYard")
    SQUARE_YARD("squareYard"),
    @XmlEnumValue("squareMile")
    SQUARE_MILE("squareMile"),
    @XmlEnumValue("litersPerSquareMeter")
    LITERS_PER_SQUARE_METER("litersPerSquareMeter"),
    @XmlEnumValue("bushelsPerAcre")
    BUSHELS_PER_ACRE("bushelsPerAcre"),
    @XmlEnumValue("litersPerHectare")
    LITERS_PER_HECTARE("litersPerHectare"),
    @XmlEnumValue("squareMeterPerKilogram")
    SQUARE_METER_PER_KILOGRAM("squareMeterPerKilogram"),
    @XmlEnumValue("metersPerSecond")
    METERS_PER_SECOND("metersPerSecond"),
    @XmlEnumValue("metersPerDay")
    METERS_PER_DAY("metersPerDay"),
    @XmlEnumValue("feetPerDay")
    FEET_PER_DAY("feetPerDay"),
    @XmlEnumValue("feetPerSecond")
    FEET_PER_SECOND("feetPerSecond"),
    @XmlEnumValue("feetPerHour")
    FEET_PER_HOUR("feetPerHour"),
    @XmlEnumValue("yardsPerSecond")
    YARDS_PER_SECOND("yardsPerSecond"),
    @XmlEnumValue("milesPerHour")
    MILES_PER_HOUR("milesPerHour"),
    @XmlEnumValue("milesPerSecond")
    MILES_PER_SECOND("milesPerSecond"),
    @XmlEnumValue("milesPerMinute")
    MILES_PER_MINUTE("milesPerMinute"),
    @XmlEnumValue("centimetersPerSecond")
    CENTIMETERS_PER_SECOND("centimetersPerSecond"),
    @XmlEnumValue("millimetersPerSecond")
    MILLIMETERS_PER_SECOND("millimetersPerSecond"),
    @XmlEnumValue("centimeterPerYear")
    CENTIMETER_PER_YEAR("centimeterPerYear"),
    @XmlEnumValue("knots")
    KNOTS("knots"),
    @XmlEnumValue("kilometersPerHour")
    KILOMETERS_PER_HOUR("kilometersPerHour"),
    @XmlEnumValue("metersPerSecondSquared")
    METERS_PER_SECOND_SQUARED("metersPerSecondSquared"),
    @XmlEnumValue("waveNumber")
    WAVE_NUMBER("waveNumber"),
    @XmlEnumValue("cubicMeterPerKilogram")
    CUBIC_METER_PER_KILOGRAM("cubicMeterPerKilogram"),
    @XmlEnumValue("cubicMicrometersPerGram")
    CUBIC_MICROMETERS_PER_GRAM("cubicMicrometersPerGram"),
    @XmlEnumValue("amperePerSquareMeter")
    AMPERE_PER_SQUARE_METER("amperePerSquareMeter"),
    @XmlEnumValue("amperePerMeter")
    AMPERE_PER_METER("amperePerMeter"),
    @XmlEnumValue("molePerCubicMeter")
    MOLE_PER_CUBIC_METER("molePerCubicMeter"),
    @XmlEnumValue("molarity")
    MOLARITY("molarity"),
    @XmlEnumValue("molality")
    MOLALITY("molality"),
    @XmlEnumValue("candelaPerSquareMeter")
    CANDELA_PER_SQUARE_METER("candelaPerSquareMeter"),
    @XmlEnumValue("metersSquaredPerSecond")
    METERS_SQUARED_PER_SECOND("metersSquaredPerSecond"),
    @XmlEnumValue("metersSquaredPerDay")
    METERS_SQUARED_PER_DAY("metersSquaredPerDay"),
    @XmlEnumValue("feetSquaredPerDay")
    FEET_SQUARED_PER_DAY("feetSquaredPerDay"),
    @XmlEnumValue("kilogramsPerMeterSquaredPerSecond")
    KILOGRAMS_PER_METER_SQUARED_PER_SECOND("kilogramsPerMeterSquaredPerSecond"),
    @XmlEnumValue("gramsPerCentimeterSquaredPerSecond")
    GRAMS_PER_CENTIMETER_SQUARED_PER_SECOND("gramsPerCentimeterSquaredPerSecond"),
    @XmlEnumValue("gramsPerMeterSquaredPerYear")
    GRAMS_PER_METER_SQUARED_PER_YEAR("gramsPerMeterSquaredPerYear"),
    @XmlEnumValue("gramsPerHectarePerDay")
    GRAMS_PER_HECTARE_PER_DAY("gramsPerHectarePerDay"),
    @XmlEnumValue("kilogramsPerHectarePerYear")
    KILOGRAMS_PER_HECTARE_PER_YEAR("kilogramsPerHectarePerYear"),
    @XmlEnumValue("kilogramsPerMeterSquaredPerYear")
    KILOGRAMS_PER_METER_SQUARED_PER_YEAR("kilogramsPerMeterSquaredPerYear"),
    @XmlEnumValue("molesPerKilogram")
    MOLES_PER_KILOGRAM("molesPerKilogram"),
    @XmlEnumValue("molesPerGram")
    MOLES_PER_GRAM("molesPerGram"),
    @XmlEnumValue("millimolesPerGram")
    MILLIMOLES_PER_GRAM("millimolesPerGram"),
    @XmlEnumValue("molesPerKilogramPerSecond")
    MOLES_PER_KILOGRAM_PER_SECOND("molesPerKilogramPerSecond"),
    @XmlEnumValue("nanomolesPerGramPerSecond")
    NANOMOLES_PER_GRAM_PER_SECOND("nanomolesPerGramPerSecond"),
    @XmlEnumValue("kilogramsPerSecond")
    KILOGRAMS_PER_SECOND("kilogramsPerSecond"),
    @XmlEnumValue("tonnesPerYear")
    TONNES_PER_YEAR("tonnesPerYear"),
    @XmlEnumValue("gramsPerYear")
    GRAMS_PER_YEAR("gramsPerYear"),
    @XmlEnumValue("numberPerMeterSquared")
    NUMBER_PER_METER_SQUARED("numberPerMeterSquared"),
    @XmlEnumValue("numberPerKilometerSquared")
    NUMBER_PER_KILOMETER_SQUARED("numberPerKilometerSquared"),
    @XmlEnumValue("numberPerMeterCubed")
    NUMBER_PER_METER_CUBED("numberPerMeterCubed"),
    @XmlEnumValue("numberPerLiter")
    NUMBER_PER_LITER("numberPerLiter"),
    @XmlEnumValue("numberPerMilliliter")
    NUMBER_PER_MILLILITER("numberPerMilliliter"),
    @XmlEnumValue("metersPerGram")
    METERS_PER_GRAM("metersPerGram"),
    @XmlEnumValue("numberPerGram")
    NUMBER_PER_GRAM("numberPerGram"),
    @XmlEnumValue("gramsPerGram")
    GRAMS_PER_GRAM("gramsPerGram"),
    @XmlEnumValue("microgramsPerGram")
    MICROGRAMS_PER_GRAM("microgramsPerGram"),
    @XmlEnumValue("cubicCentimetersPerCubicCentimeters")
    CUBIC_CENTIMETERS_PER_CUBIC_CENTIMETERS("cubicCentimetersPerCubicCentimeters");
    private final String value;

    OtherUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OtherUnitType fromValue(String v) {
        for (OtherUnitType c: OtherUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}