<div class="container">
	<!-- Bredcrumb -->
	<div class="row">
		<div class="col-xs-12">
			<ol class="breadcrumb">
				<li><a href="${contextRoot}/home">Home&nbsp;</a></li>
				<li><a href="${contextRoot}/show/all/products">| Products |</a></li>
				<li class="active">&nbsp;${product.name}</li>
			</ol>
		</div>
	</div>
	<div class="row">

		<!-- display the product image -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">

				<img src="${images}/${product.code}.jpg" class="img img-responsive" />

			</div>
		</div>

		<!-- Description of the product -->



		<div class="col-xs-12 col-sm-8">

			<h3>${product.name}</h3>


			<p>${product.description}</p>

			<h4>
				Price : <strong> &#8377; ${product.unitprice}/- </strong>
			</h4>



			<c:choose>
				<c:when test="${product.quantity<1}">
					<h6>
						Qty.Available: <span style="color:red"> Out of stock</span><span>
					</h6>
				</c:when>
				<c:otherwise>

					<h6>Qty. Available: ${product.quantity }</h6>

				</c:otherwise>
			</c:choose>

			<c:choose>
				<c:when test="${product.quantity<1}">
					<h6>
						<a href="javscript:void(0)" class="btn btn-primary disabled "><strike>
					    <span class="glyphicon glyphicon-shopping-cart"></span> Add to cart
						</strike></a>
					</h6>
				</c:when>

				<c:otherwise>

					<a href="${contextRoot}/cart/add/${product.id}/product"
						class="btn btn-primary"> <span
						class="glyphicon glyphicon-shopping-cart"></span> Add to cart
					</a>

				</c:otherwise>
			</c:choose>



			<a href="${contextRoot}/show/all/products" class="btn btn-success">Back
			</a>



		</div>
	</div>
</div>




