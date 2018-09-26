<div class="container">
	<div class="row">
		<!-- would be display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to show the actual products -->
		<div class="col-md-9">

			<!-- added breadcrumb component -->
			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home&nbsp;</a></li>
							<li class="active">| All Products |</li>
						</ol>
					</c:if>

					<c:if test="${userClickContact == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/repairing">Home&nbsp;</a></li>
							<li class="active">|Contact|</li>
						</ol>
					</c:if>


					<c:if test="${userClickCategoryProducts == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>

						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home&nbsp;</a></li>
							<li class="active">Category</li>
							<li class="active">&nbsp;${category.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
			<div class="row">

				<div class="col-lg-12">

					<table id="productListTable"
						class="table table-striped table-borded">
						<!--class= "table table-hover">-->



						<thead>
							<tr>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Avilable</th>
								<th></th>
							</tr>
						</thead>
						
						<tfoot>
							<tr>
								<th>Name</th>
								<th>Brand</th>
								<th>Price</th>
								<th>Qty. Avilable</th>
								<th></th>
							</tr>
						</tfoot>
						

					</table>
				</div>
			</div>
		</div>
	</div>
</div>