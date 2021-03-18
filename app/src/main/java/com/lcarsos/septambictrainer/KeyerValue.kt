package com.lcarsos.septambictrainer

/**
 * This layout is the Modified NASA layout used in the Spiffchorder.
 * https://chorder.cs.vassar.edu/doku.php?id=spiffchorder:modified_nasa:chart_alphanumeric_keys
 */

val KEYER = arrayOf(
    KeyerValue.Null,
    KeyerValue.LowercaseW,
    KeyerValue.LowercaseY,
    KeyerValue.LowercaseU,
    KeyerValue.LowercaseR,
    KeyerValue.Unused,
    KeyerValue.LowercaseH,
    KeyerValue.LowercaseS,
    KeyerValue.LowercaseI,
    KeyerValue.LowercaseB,
    KeyerValue.LowercaseK,
    KeyerValue.LowercaseZ,
    KeyerValue.LowercaseD,
    KeyerValue.Unused,
    KeyerValue.LowercaseE,
    KeyerValue.LowercaseT,
    KeyerValue.Space,

    KeyerValue.LowercaseF,
    KeyerValue.LowercaseG,
    KeyerValue.LowercaseV,
    KeyerValue.LowercaseC,
    KeyerValue.CloseBracket,
    KeyerValue.LowercaseP,
    KeyerValue.LowercaseN,
    KeyerValue.LowercaseL,
    KeyerValue.LowercaseX,
    KeyerValue.LowercaseJ,
    KeyerValue.LowercaseQ,
    KeyerValue.LowercaseM,
    KeyerValue.OpenBracket,
    KeyerValue.LowercaseA,
    KeyerValue.LowercaseO,
    KeyerValue.Shift,

    KeyerValue.Function,
    KeyerValue.Escape,
    KeyerValue.Semicolon,
    KeyerValue.Comma,
    KeyerValue.Unused,
    KeyerValue.Period,
    KeyerValue.Alt,
    KeyerValue.Unused,
    KeyerValue.Insert,
    KeyerValue.Unused,
    KeyerValue.Control,
    KeyerValue.Unused,
    KeyerValue.Unused,
    KeyerValue.SingleQuote,
    KeyerValue.ShiftLock,
)
/**
 * Indexing into KeyerValue is 0b0FNCIMRP
 * Center is bit position 5
 * Near is bit position 6
 * Far is bit position 7
 *
 * Clearly, a septambic keyer only needs 7 bits.
 */
enum class KeyerValue(val display: String) {                           // PRMI NCF
    Null(""),                       // 0000 000
    Unused(""),
    LowercaseW("w"),                // 1000 000
    LowercaseY("y"),                // 0100 000
    LowercaseU("u"),                // 1100 000
    LowercaseR("r"),                // 0010 000
    //Unused(0x05),                    // 1010 000
    LowercaseH("h"),                // 0110 000
    LowercaseS("s"),                // 1110 000
    LowercaseI("i"),                // 0001 000
    LowercaseB("b"),                // 1001 000
    LowercaseK("k"),                // 0101 000
    LowercaseZ("z"),                // 1101 000
    LowercaseD("d"),                // 0011 000
    //Unused(0x0d),                    // 1011 000
    LowercaseE("e"),                // 0111 000
    LowercaseT("t"),                // 1111 000

    Space("␣"),                     // 0000 010

    LowercaseF("f"),                // 1000 010
    LowercaseG("g"),                // 0100 010
    LowercaseV("v"),                // 1100 010
    LowercaseC("c"),                // 0010 010
    CloseBracket("]"),              // 1010 010
    LowercaseP("p"),                // 0110 010
    LowercaseN("n"),                // 1110 010
    LowercaseL("l"),                // 0001 010
    LowercaseX("x"),                // 1001 010
    LowercaseJ("j"),                // 0101 010
    LowercaseQ("q"),                // 1101 010
    LowercaseM("m"),                // 0011 010
    OpenBracket("["),               // 1011 010
    LowercaseA("a"),                // 0111 010
    LowercaseO("o"),                // 1111 010

    Shift("shift"),                     // 0000 100

    Function("fn"),                  // 1000 100
    Escape("esc"),                    // 0100 100
    Semicolon(";"),                 // 1100 100
    Comma(","),                     // 0010 100
    //CloseBracket(0x25),              // 1010 100
    Period("."),                    // 0110 100
    Alt("alt"),                // 1110 100
    //LowercaseL(0x28),                // 0001 100
    Insert("Ins"),                    // 1001 100
    //LowercaseJ(0x2a),                // 0101 100
    Control("ctrl"),                // 1101 100
    //LowercaseM(0x2c),                // 0011 100
    //OpenBracket(0x2d),               // 1011 100
    SingleQuote("'"),               // 0111 100
    ShiftLock("shift lock"),                 // 1111 100
}