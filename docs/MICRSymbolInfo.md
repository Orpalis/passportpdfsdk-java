

# MICRSymbolInfo

Holds detailed information about a magnetic ink symbol detected by a MICR process.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbolValue** | **String** | Specifies the best candidate for the character representation of the detected symbol. |  [optional]
**symbolValue2** | **String** | Specifies the second best candidate for the character representation of the detected symbol. |  [optional]
**top** | **Integer** | Specifies the top coordinate of the symbol, in pixels. |  [optional]
**left** | **Integer** | Specifies the left coordinate of the symbol, in pixels. |  [optional]
**bottom** | **Integer** | Specifies the bottom coordinate of the symbol, in pixels. |  [optional]
**right** | **Integer** | Specifies the right coordinate of the symbol, in pixels. |  [optional]
**line** | **Integer** | Specifies the number of the line on which the symbol has been detected. |  [optional]
**confidence** | **Float** | Specifies the level of confidence of the best detected symbol candidate. |  [optional]
**confidence2** | **Float** | Specifies the level of confidence of the second best detected symbol candidate. |  [optional]



