//#define CATCH_CONFIG_MAIN  // This tells Catch to provide a main() - only do this in one cpp file
//#include "catch.hpp"
#include <iostream>
#include <stdexcept>

using namespace std;



double divide(int a, int b){   
    	if(b==0)
    	    throw overflow_error("Divide by zero exception");
    	else
    		return (double) a/b;     	
}
    
TEST_CASE( "Divide two integers", "[divide]" ) {
    REQUIRE( divide(6,3) == 2.0 );
    REQUIRE( divide(-10,5) == -2.0 );
    REQUIRE( divide(-3,-6) ==0.5  );
    REQUIRE( divide(3,-6) ==-0.5  );
    REQUIRE( divide(0,3) ==0.0  );
    REQUIRE_THROWS_WITH(divide(3,0),"Divide by zero exception");
  
}