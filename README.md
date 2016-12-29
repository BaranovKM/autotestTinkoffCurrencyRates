# Тест курса валют
Тест запускается кается как обычный junit и работает так : 
*  дергает сервис(в данном случае это https://www.tinkoff.ru/api/v1/currency_rates/ но его можно сменить в настройках) 
2. парсит полученый json 
3. сравнивает значения в toCurrency и  fromCurrency с теми, которые прописаны в константах 
4. если все ок, то чекается как положительные. 
Если какие-то валютные пары не совпали, то выводит их в лог (для проверки можно просто поставить кривое значение в одной из констант)

![Alt text](https://github.com/BaranovKM/autotestTinkoffCurrencyRates/blob/master/test_failed_2.png?raw=true "Optional Title")
