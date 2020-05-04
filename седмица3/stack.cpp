#include "stack.h"
#define CATCH_CONFIG_MAIN  
#include "catch.hpp"



TEST_CASE( "Stack implementation" ,"[stack]") {
    stack st(3);
	st.push(1);
	st.push(2);
	st.push(3);
    REQUIRE( st.getTop() == 3);
	REQUIRE_THROWS_WITH( st.push(4),"OverFlow\nArray size doubled\n"  );
	REQUIRE(  st.size() == 4 );
	st.pop();
    REQUIRE( st.size()==3 );
	st.pop();
	st.pop();
	st.pop();
    REQUIRE_THROWS_WITH(st.pop(),"UnderFlow\nProgram Terminated\n"); 
}