com.bookstore [[
	+ i Search {
	}
	
	+ i Manage {}
	
	+ Catalog : Search,Manage {
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
			- books : Book[1..1] -wrote-> [*]
		}	
	]]
]]