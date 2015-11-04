/*
	->				= <<use>>
	-wrote->[1..*]	= relation with the other class, where "[1..*]" is the opposite cardinality
*/
com.bookstore [[
	+ i Search {
	}
	
	+ i Manage {}
	
	+ Catalog : Search, Manage {
	}
	
	+ Patron {
		-> Search
	}
	
	// sub-package
	.book [[
		+ Book {
			# title : String
		}
		+ Author {
			- books : Book[1..*] -wrote->[1..*]
		}
	]]
]]
