cmake_minimum_required(VERSION 4.1)
project(D C)

set(CMAKE_C_STANDARD 11)

add_executable(D
        genRec/code.c
        T1E1/01_prntVar.c
        T1E1/02_io.c
        T1E1/03_shopCart.c
        T1E1/04_inSys.c
        T1E1/05_desCtrl.c
        T1E1/06_fnRcs.c
        T1E1/07_timeShii.c
        T1E1/08_pointers.c
        T1E1/09_ptrOfPtrs.c
        T1E1/10_ptrMethods.c
        T1E1/11_arrays.c
        T1E1/12_ptrArray.c
        T1E1/13_cmdLnInput.c
        T1E1/Calculator.c
        T1E1/lore_1.c
        T2E1/01.c
        T2E1/02.c
        T2E1/03.c
        T2E1/arrayOfStruct.c
        T2E1/DMA.c
        T2E1/enums.c
        T2E1/io.c
        T2E1/pointers.c
        T2E1/pointerst.c
        T2E1/structs.c
        T2E1/typedef.c
        T2E1/unions.c
        test/prac/01mallo1.c
        test/prac/02mallo2.c
        test/prac/03reallo1.c
        test/prac/04reallo2.c
        test/prac/05union1.c
        test/prac/06union2.c
        test/01_remShii.c
        test/02_inputs.c
        test/03_advInputs.c
        test/04_ptrs.c
        test/05_ptrOfPtrs.c
        test/06_ptrMethods.c
        test/palin.c
        test/reciept.c
        test/revArr.c
        test/test01.c
        test/test02.c
        test/test03.c
        test/test04.c
        test/test05.c
        test/test06.c
        test/test07.c
        test/test08.c
        test/test09.c)
