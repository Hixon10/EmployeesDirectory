var app = angular.module('app', ['ngAnimate', 'ngTouch', 'ui.grid']);

app.controller('MainCtrl', ['$scope', '$http', 'uiGridConstants', function ($scope, $http, uiGridConstants) {

    $scope.highlightFilteredHeader = function( row, rowRenderIndex, col, colRenderIndex ) {
        if( col.filters[0].term ){
            return 'header-filtered';
        } else {
            return '';
        }
    };

    $scope.gridOptions = {
        enableFiltering: true,
        onRegisterApi: function(gridApi){
            $scope.gridApi = gridApi;
        },
        columnDefs: [
            {
                field: 'firstName',
                filter: {
                    condition: uiGridConstants.filter.STARTS_WITH
                },
                headerCellClass: $scope.highlightFilteredHeader,
                name: 'Имя'
            },
            {
                field: 'lastName',
                filter: {
                    condition: uiGridConstants.filter.STARTS_WITH
                },
                headerCellClass: $scope.highlightFilteredHeader,
                name: 'Фамилия'
            },
            {
                field: 'middleName',
                filter: {
                    condition: uiGridConstants.filter.STARTS_WITH
                },
                headerCellClass: $scope.highlightFilteredHeader,
                name: 'Отчество'
            },
            {
                field: 'position',
                filter: {
                    condition: uiGridConstants.filter.STARTS_WITH
                },
                headerCellClass: $scope.highlightFilteredHeader,
                name: 'Должность'
            },
            {
                field: 'createdDate',
                filter: {
                    condition: uiGridConstants.filter.STARTS_WITH
                },
                headerCellClass: $scope.highlightFilteredHeader,
                name: 'Дата рождения'
            }
        ]
    };

    $http.get('http://localhost:8080/employees')
        .success(function(data) {
            $scope.gridOptions.data = data;

            data.forEach( function convertDates( row, index ){
                row.createdDate = row.createdDate[2] + "." + row.createdDate[1] + "." + row.createdDate[0];
            });
        });
}]);