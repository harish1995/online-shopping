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

					
					<c:if test="${userClickRepairing == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/repairing">Home&nbsp;</a></li>
							<li class="active">| Repairing |</li>
						</ol>
					</c:if>
					
					
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home&nbsp;</a></li>
							<li class="active">| Category |</li>
							<li class="active">&nbsp;${category.name}</li>
						</ol>
					</c:if>

				</div>
			</div>
		</div>
	</div>
</div>