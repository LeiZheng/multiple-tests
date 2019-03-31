gradle :cleanTest
gradle  :test --tests "DemoClassTest1" -PtestStage=1 &
gradle  :test --tests "DemoClassTest2" -PtestStage=2 &
gradle  :test --tests "DemoClassTest3" -PtestStage=3 &